package v0;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import m2.t;
public final class m implements j {
    public final CredentialManager f46469a;

    public m(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f46469a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f46469a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.i.e(context, "context");
        m.h hVar = (m.h) iVar;
        CredentialManager credentialManager = this.f46469a;
        if (credentialManager == null) {
            hVar.onError(new w0.c("Your device doesn't support credential manager", 3));
            return;
        }
        l lVar = new l(hVar, (e) bVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = bVar.f46461a;
        t tVar = bVar.f46463c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) tVar.f15110b);
        CharSequence charSequence = (CharSequence) tVar.f15111c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230829));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f46462b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.i.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, lVar);
    }

    @Override
    public final void onGetCredential(Context context, o oVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.i.e(executor, "executor");
        CredentialManager credentialManager = this.f46469a;
        if (credentialManager == null) {
            iVar.onError(new w0.h("Your device doesn't support credential manager", 3));
            return;
        }
        l lVar = new l(iVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", oVar.f46471b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (q qVar : oVar.f46470a) {
            qVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", qVar.f46473a, qVar.f46474b).setIsSystemProviderRequired(false).setAllowedProviders(qVar.f46475c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, lVar);
    }
}
