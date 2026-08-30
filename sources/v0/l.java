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
import q5.g0;
public final class l implements j {
    public final CredentialManager f45546a;

    public l(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f45546a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f45546a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.j.e(context, "context");
        o2.o oVar = (o2.o) iVar;
        CredentialManager credentialManager = this.f45546a;
        if (credentialManager == null) {
            oVar.onError(new w0.c("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(oVar, (e) bVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = bVar.f45539a;
        g0 g0Var = bVar.f45541c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) g0Var.f42806b);
        CharSequence charSequence = (CharSequence) g0Var.f42807c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230826));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f45540b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.j.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, kVar);
    }

    @Override
    public final void onGetCredential(Context context, n nVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        CredentialManager credentialManager = this.f45546a;
        if (credentialManager == null) {
            iVar.onError(new w0.h("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(iVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", nVar.f45548b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (p pVar : nVar.f45547a) {
            pVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar.f45550a, pVar.f45551b).setIsSystemProviderRequired(false).setAllowedProviders(pVar.f45552c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, kVar);
    }
}
