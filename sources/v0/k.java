package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import w7.l5;
import w7.t;
import w7.u;
public final class k implements OutcomeReceiver {
    public final int f49973a = 0;
    public final i f49974b;

    public k(i iVar, l lVar) {
        this.f49974b = iVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f49973a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                ((me.b) this.f49974b).onError(l5.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                this.f49974b.onError(l5.b(error2.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f49973a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                ((me.b) this.f49974b).onResult(t.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                this.f49974b.onResult(new o(u.a(type, data2)));
                return;
        }
    }

    public k(me.b bVar, e eVar, l lVar) {
        this.f49974b = bVar;
    }
}
