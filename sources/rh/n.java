package rh;

import org.telegram.messenger.FileLog;
public final class n extends com.google.android.gms.internal.play_billing.s1 {
    public final p f43689a;

    public n(p pVar) {
        this.f43689a = pVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.f43689a;
        dh.v vVar = pVar.f43723j;
        if (vVar != null) {
            pVar.f43723j = null;
            vVar.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        p pVar = this.f43689a;
        dh.v vVar = pVar.f43723j;
        if (vVar != null) {
            pVar.f43723j = null;
            vVar.run(Boolean.TRUE, uVar);
        }
    }
}
