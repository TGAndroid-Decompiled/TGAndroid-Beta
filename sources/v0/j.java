package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import org.telegram.messenger.zt;
import r2.y;
import w7.f8;
import w7.g8;
import w7.l9;
public final class j implements OutcomeReceiver {
    public final int f50288a = 1;
    public final h f50289b;

    public j(zt ztVar, k kVar) {
        this.f50289b = ztVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f50288a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                ((y) this.f50289b).g(l9.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                ((zt) this.f50289b).g(l9.b(error2.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f50288a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                ((y) this.f50289b).onResult(f8.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                return;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.i.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.i.d(data2, "getData(...)");
                ((zt) this.f50289b).onResult(new n(g8.a(type, data2)));
                return;
        }
    }

    public j(y yVar, e eVar, k kVar) {
        this.f50289b = yVar;
    }
}
