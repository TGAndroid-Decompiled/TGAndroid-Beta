package rh;

import org.telegram.messenger.FileLog;
public final class o extends com.google.android.gms.internal.play_billing.s1 {
    public final q f43637a;

    public o(q qVar) {
        this.f43637a = qVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        q qVar = this.f43637a;
        dh.v vVar = qVar.f43671j;
        if (vVar != null) {
            qVar.f43671j = null;
            vVar.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.v vVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        q qVar = this.f43637a;
        dh.v vVar2 = qVar.f43671j;
        if (vVar2 != null) {
            qVar.f43671j = null;
            vVar2.run(Boolean.TRUE, vVar);
        }
    }
}
