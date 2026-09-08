package q7;

import k6.c;
public abstract class b {
    public static final c f44231a;
    public static final c f44232b;
    public static final c[] f44233c;

    static {
        c cVar = new c("GET_CREDENTIAL", 1L);
        f44231a = cVar;
        c cVar2 = new c("CREDENTIAL_REGISTRY", 1L);
        c cVar3 = new c("CLEAR_REGISTRY", 2L);
        c cVar4 = new c("CLEAR_CREATION_OPTIONS", 1L);
        c cVar5 = new c("CLEAR_CREDENTIAL_STATE", 1L);
        c cVar6 = new c("CREATE_CREDENTIAL", 3L);
        f44232b = cVar6;
        f44233c = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new c("REGISTER_CREATION_OPTIONS", 1L), new c("REGISTER_EXPORT", 1L), new c("IMPORT_CREDENTIALS", 1L), new c("SIGNAL_CREDENTIAL_STATE", 1L), new c("CLEAR_EXPORT", 1L), new c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
