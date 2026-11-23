package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import c8.ad;
import c8.ke;
import c8.zc;
public final class j implements OutcomeReceiver {
    public final int f59028a = 0;
    public final g f59029b;

    public j(g gVar, k kVar) {
        this.f59029b = gVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f59028a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                ((je.b) this.f59029b).a(ke.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                this.f59029b.a(ke.b(error2.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f59028a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                ((je.b) this.f59029b).onResult(zc.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                return;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.j.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.j.d(data2, "getData(...)");
                this.f59029b.onResult(new n(ad.a(type, data2)));
                return;
        }
    }

    public j(je.b bVar, e eVar, k kVar) {
        this.f59029b = bVar;
    }
}
