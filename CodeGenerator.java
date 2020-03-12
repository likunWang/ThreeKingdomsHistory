package codegen;

import pdfc.framework.mybatis.generator.*;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

	public static void main(String[] args) {
		List<GenParam> paramList = new ArrayList<GenParam>();
		/**
		 * 请保持生成参数的完整，不要注释
		 */
		paramList.add(new GenParam("robot",
				new String[] { "prpd_code_config","prpd_common_switch","vehicle_query_log"}));
		GenConfig gc = new GenConfig();
		gc.setBasePackage("pdfc.vehiclequery");
		// 设置要忽略的表名前缀，默认空
		gc.setIgnoreTablePrefixs(new String[] { "", "" });
		// 设置PO是否保留前缀(设置忽略表名前缀时)，默认true
		gc.setKeepPrefixForPO(false);
		// 支持tkey特性
		gc.setTkeySupport(true);
		// 生成update语句时忽略的字段
		gc.setIgnoreColumnNamesWhenUpdate(new String[] { "tkey" });
		// 设置代码样式为DDD
		gc.setCodeStyle(CodeStyle.DDD);
		// 数据库相关配置
		// 设置基本保存目录（Java源代码根目录）
		gc.setSaveDir("src/main/java");
		gc.setDbDriverName("org.postgresql.Driver");
		gc.setDbUser("");
		gc.setDbCatalog(""); // MySQL的Catalog通常和数据库名一致，采用8.0+版驱动后需要设置
		gc.setDbSchema("");
		gc.setDbPassword("");
		gc.setDbUrl("");
		if(ceshi){
			test
		}
		// 支持生成的文件类型:生成PO、BASE_MAPPER_XML（自动覆盖）、Dao、VO、MapperXML（不覆盖）
		gc.setGenTypes(
//				new GenType[] { GenType.VO, GenType.PO, GenType.DAO, GenType.BASE_MAPPER_XML, GenType.MAPPER_XML });
		        new GenType[] { GenType.PO, GenType.DAO, GenType.BASE_MAPPER_XML, GenType.MAPPER_XML });

		Generator generator = new Generator();
		generator.setGenConfig(gc);
		generator.setParamList(paramList);
		generator.generate();
	}
}
