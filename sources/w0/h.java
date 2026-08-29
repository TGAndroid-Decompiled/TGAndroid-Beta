package w0;
public final class h extends i {
    public h(CharSequence charSequence, int i10) {
        super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (i10) {
            case 2:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                return;
            case 3:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                return;
            default:
                return;
        }
    }

    public h(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
