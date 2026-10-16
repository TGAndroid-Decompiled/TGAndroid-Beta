package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import w7.a8;
import w7.z7;
import w7.z8;
public final class l implements OutcomeReceiver {
    public final int f46467a = 0;
    public final i f46468b;

    public l(i iVar, m mVar) {
        this.f46468b = iVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f46467a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                ((m.h) this.f46468b).onError(z8.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                this.f46468b.onError(z8.b(error2.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f46467a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                ((m.h) this.f46468b).onResult(z7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                this.f46468b.onResult(new p(a8.a(type, data2)));
                return;
        }
    }

    public l(m.h hVar, e eVar, m mVar) {
        this.f46468b = hVar;
    }
}
