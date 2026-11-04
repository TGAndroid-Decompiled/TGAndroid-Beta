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
import mi.h0;
import org.telegram.messenger.et;
public final class k implements i {
    public final CredentialManager f56430a;

    public k(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f56430a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f56430a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.j.e(context, "context");
        ge.b bVar2 = (ge.b) hVar;
        CredentialManager credentialManager = this.f56430a;
        if (credentialManager == null) {
            bVar2.a(new w0.c(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(bVar2, (e) bVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = bVar.f56422a;
        h0 h0Var = bVar.f56424c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) h0Var.f19644b);
        CharSequence charSequence = (CharSequence) h0Var.f19645c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f56423b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.j.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, jVar);
    }

    @Override
    public final void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        et etVar = (et) hVar;
        CredentialManager credentialManager = this.f56430a;
        if (credentialManager == null) {
            etVar.a(new w0.h(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(etVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", mVar.f56432b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (o oVar : mVar.f56431a) {
            oVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", oVar.f56434a, oVar.f56435b).setIsSystemProviderRequired(false).setAllowedProviders(oVar.f56436c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, jVar);
    }
}
