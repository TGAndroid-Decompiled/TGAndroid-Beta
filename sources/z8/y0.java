package z8;

import com.google.android.gms.common.api.Status;
public final class y0 extends b {
    public c8.e f52800b;

    @Override
    public final void N(u0 u0Var) {
        String str;
        int i10 = u0Var.f52784a;
        switch (i10) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                str = y8.j.a(i10);
                break;
        }
        j0 j0Var = new j0(new Status(i10, str, null, null), u0Var.f52785b);
        c8.e eVar = this.f52800b;
        if (eVar != null) {
            eVar.a(j0Var);
            this.f52800b = null;
        }
    }
}
