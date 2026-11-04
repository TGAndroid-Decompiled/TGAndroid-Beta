package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import org.telegram.messenger.et;
import x7.g5;
import x7.h5;
import x7.q6;
public final class j implements OutcomeReceiver {
    public final int f56428a = 0;
    public final h f56429b;

    public j(et etVar, k kVar) {
        this.f56429b = etVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f56428a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                ((ge.b) this.f56429b).a(q6.a(error.getMessage(), type));
                return;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                ((et) this.f56429b).a(q6.b(error2.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f56428a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                ((ge.b) this.f56429b).onResult(g5.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                ((et) this.f56429b).onResult(new n(h5.a(type, data2)));
                return;
        }
    }

    public j(ge.b bVar, e eVar, k kVar) {
        this.f56429b = bVar;
    }
}
