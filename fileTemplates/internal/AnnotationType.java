#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
/**
 * Created on ${DATE}
 * @author Wavky.Huang
 */
#if (${VISIBILITY} == "PUBLIC")public #end @interface ${NAME} #if (${INTERFACES} != "")extends ${INTERFACES} #end {
}
