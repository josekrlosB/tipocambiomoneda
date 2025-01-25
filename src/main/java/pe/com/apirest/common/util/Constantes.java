package pe.com.apirest.common.util;

public class Constantes {

	private Constantes() {
		super();
	}

	public static final String FORMATOFECHACABECERA = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	public static final String RESPONSEBODY = "Response Body: \n";
	public static final String PROPERTIESKEY = "claro.properties";
	public static final String NOMBRERECURSO = "rest-tipocambio";
	public static final String BASE_PATH = "/api/post/tipocambio/v1.0.0";
	
	public static final String PATHMETODO_convertirMoneda = "/convertir";
	public static final String METODO_convertirMoneda = "convertirMoneda";
	
	public static final String PATHMETODO_actualizarTipoCambio = "/actualizar";
	public static final String METODO_actualizarTipoCambio = "actualizarTipoCambio";

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static final String IDTRANSACCION = "idTransaccion";
	public static final String MSGID = "msgid";
	public static final String TIMESTAMP = "timestamp";
	public static final String USERID = "userId";
	public static final String CANAL = "canal";
	public static final String ACCEPT = "accept";
	public static final String APLICACION = "aplicacion";
	
	public static final String APPLICATION_JSON = "application/json";
	
	public static final String LOG_HEADER = "Header Request: ";
	public static final String LOG_REQUEST = "Body Request: ";
	public static final String APPLICATION = "application/json";

	public static final String SEPARADOR_DOS_LLAVES = "{}{}";
	public static final String SEPARADOR_TRES_LLAVES = "{}{}{}";
	public static final String PARAMETROSHEADER = " Header Request: ";
	public static final String PARAMETROSBODY = " Body Request: ";
	
	public final static char PUNTO = '.';
	public final static char GUION_BAJO = '_';
	public final static char GUION_MEDIO = '-';
	public final static char SLASH = '/';
	public final static char PALOTE = '|';
	
	public static final String PUNTOS = ": ";
	public static final String CHARCORCHETEIZQ = " [";
	public static final String CHARCORCHETEDER = "] ";
	public static final String COMA = ",";
	public static final String VACIO = "";
	public static final String GUION = "-";
	public final static String SALTO_LINEA = "\n";
	
	public static final String EQUIS = "XXXX";
	
	public static final int INT_ZERO = 0;
	public static final int INT_UNO = 1;
	public static final String EX_CON_CORCHETE = "[$ex]";
	public static final String VARIABLE_NOMBRE = "$nom";
	public static final String VARIABLE_METODO = "$me";
	public static final String ERROR_MENSAJE = " [ERROR]: ";
	
	public static final String TIMEOUT_CONEXION = "CONEXION TIMEOUT: ";
	public static final String TIMEOUT_EJECUCION= "EJECUCION TIMEOUT: ";
	public static final String CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout";
	public static final String REQUEST_TIMEOUT = "com.sun.xml.ws.request.timeout";
	
	public static final String ERROR = "{0} Error: ";
	public static final String TIPO_TOTAL_PROCESO = "{0} Tiempo TOTAL Proceso: [{1} milisegundos ]";

	public static final String EXCEPTION_WS_TIMEOUT_01 = "timed out";
	public static final String EXCEPTION_WS_TIMEOUT_02 = "SocketTimeoutException";
	public static final String EXCEPTION_WS_NO_DISPONIBLE_01 = "RemoteAccessException";
	public static final String EXCEPTION_WS_NO_DISPONIBLE_02 = "404";
	public static final String EXCEPTION_WS_NO_DISPONIBLE_03 = "WebServiceException";
	public static final String EXCEPTION_WS_NO_DISPONIBLE_04 = "HttpHostConnectException";
	public static final String EXCEPTION_WS_NO_DISPONIBLE_05 = "disponibilidad";
	
	public static final String PARAMETROS_ENTRADA = " PARAMETROS [INPUT]: ";
	public static final String PARAMETROS_SALIDA = " PARAMETROS [OUTPUT]: ";
	
	public static final String CONECTIONSERVICIO = "Conectando con el servicio";
	public static final String URLSERVICIO = "Servicio a invocar: [";
	public static final String TEXTMETODO = "], metodo: [";
	public static final String TIMEOUT = "Timeout";
	
	public static final String SIZE_CURSOR = "TAMAÑO CURSOR : ";
	
	public static final String SIAC = "SIAC";
	public static final String SISACT = "SISACT";
	
	// ----- 
	public static final String PI_ALERTA_POPUD_OK = "PI_ALERTA_POPUP_OK";
	public static final String PI_VISTO = "PI_VISTO";
	public static final String PI_USER_MOD = "PI_USER_MOD";
	public static final String PI_ID_TRAZABILIDAD = "PI_ID_TRAZABILIDAD";
	public static final String PI_ORDEN = "PI_ORDEN";
	
	public static final String PO_COD_RESPUESTA = "PO_COD_RESPUESTA";
	public static final String PO_MSG_RESPUESTA = "PO_MSG_RESPUESTA";
	
	public static final String HTTP_CODE = " http code: ";
	
	//---
	public static final String PI_APLI_COD = "PI_APLI_COD";
	public static final String PI_PERF_COD = "PI_PERF_COD";
	public static final String PI_PDV_COD = "PI_PDV_COD";
	public static final String PI_CANAL_COD = "PI_CANAL_COD";
	public static final String PI_LINEA = "PI_LINEA";
	public static final String PI_TIPO_DOC_COD = "PI_TIPO_DOC_COD";
	public static final String PI_NRO_DOCUMENTO = "PI_NRO_DOCUMENTO";
	public static final String PI_CUSTOMERID = "PI_CUSTOMERID";
	public static final String PI_COID = "PI_COID";
	
	public static final String PO_CURPERFIL = "PO_CURPERFIL";
	
	public static final String PO_CURCAMPANA = "PO_CURCAMPANA";
	
	//---------
	public static final String PI_CUPTC_CANAL_COD = "PI_CUPTC_CANAL_COD";
	public static final String PI_CUPTV_CANAL_DESC = "PI_CUPTV_CANAL_DESC";
	public static final String PI_CUPTV_PDV_CODIGO = "PI_CUPTV_PDV_CODIGO";
	public static final String PI_CUPTV_PDV_DESCRIPCION = "PI_CUPTV_PDV_DESCRIPCION";
	public static final String PI_CUPTC_ALERTA_POPUP = "PI_CUPTC_ALERTA_POPUP";
	public static final String PI_CUPTV_ALERTA_POPUP_DES = "PI_CUPTV_ALERTA_POPUP_DES";
	public static final String PI_CUPTC_ALERTA_POPUP_OK = "PI_CUPTC_ALERTA_POPUP_OK";
	public static final String PI_CUPTV_OPERACION = "PI_CUPTV_OPERACION";
	public static final String PI_CUPTN_APLI_COD = "PI_CUPTN_APLI_COD";
	public static final String PI_CUPTV_APLI_DES = "PI_CUPTV_APLI_DES";
	public static final String PI_CUPTV_APLI_ABREV = "PI_CUPTV_APLI_ABREV";
	public static final String PI_CUPTN_PERF_COD = "PI_CUPTN_PERF_COD";
	public static final String PI_CUPTV_PERF_DES = "PI_CUPTV_PERF_DES";
	public static final String PI_CUPTV_PERF_ABREV = "PI_CUPTV_PERF_ABREV";
	public static final String PI_CUPTV_LINEA = "PI_CUPTV_LINEA";
	public static final String PI_CUPTC_TIPO_DOC = "PI_CUPTC_TIPO_DOC";
	public static final String PI_CUPTV_NRO_DOC = "PI_CUPTV_NRO_DOC";
	public static final String PI_CUPTV_CUSTOMER_ID = "PI_CUPTV_CUSTOMER_ID";
	public static final String PI_CUPTV_CO_ID= "PI_CUPTV_CO_ID";
	public static final String PI_CUPTV_USER = "PI_CUPTV_USER";
	public static final String PI_CURSOR_DETALLE = "PI_CURSOR_DETALLE";
	public static final String PO_CUPTN_CODIGO = "PO_CUPTN_CODIGO";
	
	/**/
	public static final String PI_DATOS_ASESOR = "PI_DATOS_ASESOR";
	public static final String PO_CUR_BUSCAROFERTA = "PO_CUR_BUSCAROFERTA";
	
	/* AUDIT PKG_EAI_DBAUDIT.AUDISS_DATOS_X_USUARIO */
	public static final String PI_USUARIO = "PI_USUARIO";
	public static final String PI_LISTAAPLICACION = "PI_LISTAAPLICACION";
	public static final String PO_CURSOR = "PO_CURSOR";
	
	public static final String WS_REQUEST = " Datos de [REQUEST]: ";
	public static final String WS_RESPONSE = " Datos de [RESPONSE]: ";
	
	public static final String TEXTO_VACIO = "";
	public static final String ERROR_COR = "ERROR: [";
	public static final String MILISEGUNDOS = " milisegundos ]";
	public static final String TIEMPO_TOTAL = "Tiempo total de proceso (milisegundos): ";
	public static final String STRING_CERO = "0";
	public static final String STRING_UNO = "1";
	public static final String IDTX = "[idTx=";
	public static final String ERROR_EXCEPTION = "Error Exception: ";
	
	public static final String BD = "DB: ";
	public static final String OWNER = "OWMER: ";
	public static final String JNDI = "JNDI: ";
	public static final String SP = "SP: ";
	
	public static final String ERROR_EJECUCION_SP = " Error en la ejecucion del SP : ";
	public static final String TIMEOUTEXCEPTION = "Timeout";
	public static final String PERSISTENCEEXCEPTION = "javax.persistence.PersistenceException";
	public static final String HIBERNATEJDBCEXCEPTION = "The application must supply JDBC connections";
	public static final String GENERICJDBCEXCEPTION = "org.hibernate.exception";
	
	public static final String TRACE = " [TRACE] ";
	public static final String CODE = " [CODE]= ";
	public static final String MSG = " [MSG]= ";
	
	public static final String ERROR_JMS_EXCEPTION = "[ERROR JMS_EXCEPTION]:";
	public static final String ERROR_WS_EXCEPTION = "[ERROR WS_EXCEPTION]:";
	public static final String ERROR_DB_EXCEPTION = "[ERROR DB_EXCEPTION]:";
	public static final String ERROR_IDF_EXCEPTION = "[ERROR IDF_EXCEPTION]:";
	
	public static final String RECURSO = "RECURSO";
	public static final String DETALLE = "$detalle";
	public static final String EXCEPTION_MESSAGE = "[EXCEPTION_MESSAGE]";
	public static final String EXCEP_WS = "Excepcion ocurrida en el WS {";
	
	public static final String TIME_TOTAL_PROCESS = "[FIN de metodo: run] Tiempo total de proceso(ms): ";
	
	public static final String AT_ACT1= "1. Validar parámetros de entrada";
	public static final String AT_ACT2= "2. Actualizar Trazabilidad";
	
	public static final String ACT1 = "1. Validar parámetros de entrada";
	
	public static final String OF_ACT2 = "2. Buscar Oferta";
	public static final String OF_ACT3 = "3. Registrar trazabilidad";
	
	public static final String VP_ACT2 = "2. Obtener tipo de documento CRM";
	public static final String VP_ACT3 = "3. Homologar tipo de documento CRM";
	public static final String VP_ACT4 = "4. Consultar aplicaciones y perfiles por usuario";
	public static final String VP_ACT5 = "5. Buscar Oferta";
	public static final String VP_ACT6 = "6. Registrar trazabilidad";
	public static final String VP_ACT7 = "7. Obtener sesiones de usuario";
	public static final String VP_ACT8 = "8. Registrar comunicacion";
	
	public static final String NOHAYRESULTADO = "NO HAY RESULTADOS";
	
	public static final String CANNOT_GET_CONNECTION = "Cannot get connection: ";
	public static final String ORACLEDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String PARAMETRO_INICIAL_JDBC = "jdbc:oracle";
	public static final String PARAMETRO_CALL = "{call ";
	
	public static final String LOG_ACT1_ERROR1 = "VALIDACION PARAMETROS INCORRECTOS. AL MENOS UNO DEBE TENER UN VALOR ASIGNADO.";
	public static final String LOG_ACT1_ERROR2 = "VALIDACION PARAMETROS INCORRECTOS.";
	public static final String LOG_ACT3_MSJ1 = "Se Pudo Homologar Tipo Documento CRM.";
	public static final String LOG_ACT3_MSJ2 = "No Se Pudo Homologar Tipo Documento CRM.";
	
	public static final String LOGOF_ACT1_ERROR3 = "DEBE TENER AL MENOS UNA LISTA.";
	public static final String LOGOF_ACT1_ERROR4 = "VALIDACION PARAMETROS CORRECTOS.";
	
	public static final String LOG_ACT1_ERROR5 = "VALIDACION PARAMETROS INCORRECTOS.";
	
	// BD
	public static final String INICIOMETODO = "[INICIO DB] - METODO: [ ";
	public static final String FINMETODO = "[FIN DB] - METODO: [ ";
	
	public static final String SEPARADOR_DOBLE = "=========================================================================================";
	// METODO REST
	public static final String METODO_REST = "$rsme";
	public static final String WS_INICIO_METODO = " [=============== [INICIO] - METODO: [ $rsme ] ===============] ";
	public static final String WS_FIN_METODO = " [=============== [FIN] - METODO: [ $rsme ] ===============] ";
	
	// IMPLEMENTACION
	public static final String NOMBRE_WS = "$nomws";
	public static final String METODO_WS = "$wsme";
	public static final String TIME_TOTAL = "$tmtl";
	public static final String WS_INICIO_IMPLEMENT = " ---------- INCIO IMPLEMENTACION SERVICIO : [$nomws] - METODO : [$wsme] ----------";
	public static final String WS_FIN_IMPLEMENT = " ---------- FIN IMPLEMENTACION METODO: [$wsme - PROXY WS ]. Tiempo total de proceso  [$tmtl] (ms) ----------";

	// ACTIVIDADES 
	public static final String NOMBRE_ACT = "$actnom";
	public static final String ACTIVIDAD_INICIO = " [=============== [ INICIO ACTIVIDAD : $actnom ] ===============] ";
	public static final String ACTIVIDAD_FIN = " [=============== [ FIN ACTIVIDAD : $actnom ] ===============] ";
	
}