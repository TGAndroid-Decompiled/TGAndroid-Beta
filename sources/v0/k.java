package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import i7.f8;
import i7.g8;
import i7.u8;
public final class k implements OutcomeReceiver {
    public final int f49312a = 0;
    public final i f49313b;

    public k(i iVar, l lVar) {
        this.f49313b = iVar;
    }

    @Override
    public final void onError(Throwable th2) {
        switch (this.f49312a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                ((o4.g) this.f49313b).onError(u8.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.f49313b;
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                iVar.onError(u8.b(error2.getMessage(), type2));
                return;
        }
    }

    @Override
    public final void onResult(Object obj) {
        switch (this.f49312a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                ((o4.g) this.f49313b).onResult(f8.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                return;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                i iVar = this.f49313b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.j.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.j.d(data2, "getData(...)");
                iVar.onResult(new o(g8.a(type, data2)));
                return;
        }
    }

    public k(o4.g gVar, e eVar, l lVar) {
        this.f49313b = gVar;
    }
}
