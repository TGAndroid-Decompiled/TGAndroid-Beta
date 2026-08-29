package ph;

import org.telegram.messenger.FileLog;
public final class n extends h7.v {
    public final p f45913a;

    public n(p pVar) {
        this.f45913a = pVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.f45913a;
        bh.v vVar = pVar.f45948j;
        if (vVar != null) {
            pVar.f45948j = null;
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
        p pVar = this.f45913a;
        bh.v vVar = pVar.f45948j;
        if (vVar != null) {
            pVar.f45948j = null;
            vVar.run(Boolean.TRUE, uVar);
        }
    }
}
