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
public final class l implements j {
    public final CredentialManager f49314a;

    public l(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f49314a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f49314a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.j.e(context, "context");
        o4.g gVar = (o4.g) iVar;
        CredentialManager credentialManager = this.f49314a;
        if (credentialManager == null) {
            gVar.onError(new w0.c("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(gVar, (e) bVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = bVar.f49307a;
        oc.i iVar2 = bVar.f49309c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) iVar2.f19483b);
        CharSequence charSequence = (CharSequence) iVar2.f19484c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230826));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f49308b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.j.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, kVar);
    }

    @Override
    public final void onGetCredential(Context context, n nVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        CredentialManager credentialManager = this.f49314a;
        if (credentialManager == null) {
            iVar.onError(new w0.h("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(iVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", nVar.f49316b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (p pVar : nVar.f49315a) {
            pVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", pVar.f49318a, pVar.f49319b).setIsSystemProviderRequired(false).setAllowedProviders(pVar.f49320c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, kVar);
    }
}
