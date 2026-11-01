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
import org.telegram.messenger.zt;
import r2.y;
public final class k implements i {
    public final CredentialManager f50290a;

    public k(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f50290a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.f50290a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        y yVar = (y) hVar;
        CredentialManager credentialManager = this.f50290a;
        if (credentialManager == null) {
            yVar.g(new w0.c(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(yVar, (e) bVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = bVar.f50283a;
        m5.e eVar = bVar.f50285c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) eVar.f13014b);
        CharSequence charSequence = (CharSequence) eVar.f13015c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.f50284b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.i.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, jVar);
    }

    @Override
    public final void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.i.e(executor, "executor");
        zt ztVar = (zt) hVar;
        CredentialManager credentialManager = this.f50290a;
        if (credentialManager == null) {
            ztVar.g(new w0.h(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(ztVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", mVar.f50292b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (o oVar : mVar.f50291a) {
            oVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", oVar.f50294a, oVar.f50295b).setIsSystemProviderRequired(false).setAllowedProviders(oVar.f50296c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, jVar);
    }
}
