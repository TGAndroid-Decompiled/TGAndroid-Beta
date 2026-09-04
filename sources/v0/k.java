package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import w7.b9;
import w7.u7;
import w7.v7;
public final class k implements OutcomeReceiver {
    public final int f47268a = 0;
    public final i f47269b;

    public k(i iVar, l lVar) {
        this.f47269b = iVar;
    }

    @Override
    public final void onError(Throwable th2) {
        switch (this.f47268a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                ((mg.n) this.f47269b).onError(b9.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.f47269b;
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                iVar.onError(b9.b(error2.getMessage(), type2));
                return;
        }
    }

    @Override
    public final void onResult(Object obj) {
        switch (this.f47268a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                ((mg.n) this.f47269b).onResult(u7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                return;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                i iVar = this.f47269b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.i.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.i.d(data2, "getData(...)");
                iVar.onResult(new o(v7.a(type, data2)));
                return;
        }
    }

    public k(mg.n nVar, e eVar, l lVar) {
        this.f47269b = nVar;
    }
}
