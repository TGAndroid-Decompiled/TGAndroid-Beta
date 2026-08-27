package p5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.view.KeyEvent;
import m5.q;
import y5.l;

public final class g extends t {

    public final h f45487a;

    public g(h hVar) {
        this.f45487a = hVar;
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        h.v.b("onCustomAction with action = %s", str);
        int iHashCode = str.hashCode();
        h hVar = this.f45487a;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    long j10 = -hVar.f45491e.f19321c;
                    o5.h hVar2 = hVar.f45499n;
                    if (hVar2 == null) {
                        return;
                    }
                    long jMin = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                    o5.h hVar3 = hVar.f45499n;
                    if (hVar3 == null) {
                        return;
                    }
                    hVar3.q(new q(jMin));
                    return;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    n5.h hVar4 = hVar.d;
                    if (hVar4 != null) {
                        hVar4.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    n5.h hVar5 = hVar.d;
                    if (hVar5 != null) {
                        hVar5.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    long j11 = hVar.f45491e.f19321c;
                    o5.h hVar6 = hVar.f45499n;
                    if (hVar6 == null) {
                        return;
                    }
                    long jMin2 = Math.min(hVar6.g(), Math.max(0L, hVar6.a() + j11));
                    o5.h hVar7 = hVar.f45499n;
                    if (hVar7 == null) {
                        return;
                    }
                    hVar7.q(new q(jMin2));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hVar.f45493g);
        hVar.f45488a.sendBroadcast(intent);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        o5.h hVar;
        h.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (hVar = this.f45487a.f45499n) == null) {
            return true;
        }
        hVar.r();
        return true;
    }

    @Override
    public final void onPause() {
        h.v.b("onPause", new Object[0]);
        o5.h hVar = this.f45487a.f45499n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onPlay() {
        h.v.b("onPlay", new Object[0]);
        o5.h hVar = this.f45487a.f45499n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onSeekTo(long j10) {
        h.v.b("onSeekTo %d", Long.valueOf(j10));
        o5.h hVar = this.f45487a.f45499n;
        if (hVar == null) {
            return;
        }
        hVar.q(new q(j10));
    }

    @Override
    public final void onSkipToNext() {
        h.v.b("onSkipToNext", new Object[0]);
        o5.h hVar = this.f45487a.f45499n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                o5.h.x(new o5.i(hVar, 2));
            } else {
                o5.h.t();
            }
        }
    }

    @Override
    public final void onSkipToPrevious() {
        h.v.b("onSkipToPrevious", new Object[0]);
        o5.h hVar = this.f45487a.f45499n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                o5.h.x(new o5.i(hVar, 1));
            } else {
                o5.h.t();
            }
        }
    }
}
