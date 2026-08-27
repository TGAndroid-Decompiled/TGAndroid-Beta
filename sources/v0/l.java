package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import h7.o8;
import h7.t7;
import h7.u7;
import java.lang.reflect.InvocationTargetException;

public final class l implements OutcomeReceiver {

    public final int f48663a = 0;

    public final i f48664b;

    public l(i iVar, m mVar) {
        this.f48664b = iVar;
    }

    @Override
    public final void onError(Throwable th) throws IllegalAccessException, InvocationTargetException {
        switch (this.f48663a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                sd.b bVar = (sd.b) this.f48664b;
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                bVar.onError(o8.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.f48664b;
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                iVar.onError(o8.b(error2.getMessage(), type2));
                break;
        }
    }

    @Override
    public final void onResult(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.f48663a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                sd.b bVar = (sd.b) this.f48664b;
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                bVar.onResult(t7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                i iVar = this.f48664b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.j.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.j.d(data2, "getData(...)");
                iVar.onResult(new p(u7.a(type, data2)));
                break;
        }
    }

    public l(sd.b bVar, e eVar, m mVar) {
        this.f48664b = bVar;
    }
}
