package sh;

import org.telegram.messenger.FileLog;
public final class n extends ee.b {
    public final p f47538a;

    public n(p pVar) {
        this.f47538a = pVar;
    }

    @Override
    public final void b(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.f47538a;
        eh.w wVar = pVar.f47573j;
        if (wVar != null) {
            pVar.f47573j = null;
            wVar.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void c() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void d(androidx.biometric.v vVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        p pVar = this.f47538a;
        eh.w wVar = pVar.f47573j;
        if (wVar != null) {
            pVar.f47573j = null;
            wVar.run(Boolean.TRUE, vVar);
        }
    }
}
