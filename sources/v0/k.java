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
import tg.x;
public final class k implements i {
    public final CredentialManager f58455a;

    public k(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f58455a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f58455a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.j.e(context, "context");
        u7.i iVar = (u7.i) gVar;
        CredentialManager credentialManager = this.f58455a;
        if (credentialManager == null) {
            iVar.a(new w0.c(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(iVar, (e) bVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = bVar.f58446a;
        x xVar = bVar.f58448c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) xVar.f57597b);
        CharSequence charSequence = (CharSequence) xVar.f57598c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f58447b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.j.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, jVar);
    }

    @Override
    public final void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        CredentialManager credentialManager = this.f58455a;
        if (credentialManager == null) {
            gVar.a(new w0.h(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(gVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", mVar.f58457b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (h hVar : mVar.f58456a) {
            builder.addCredentialOption(new CredentialOption.Builder(hVar.f58450a, hVar.f58451b, hVar.f58452c).setIsSystemProviderRequired(false).setAllowedProviders(hVar.d).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, jVar);
    }
}
