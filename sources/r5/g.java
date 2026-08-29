package r5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.view.KeyEvent;
import o5.p;
import z5.l;
public final class g extends t {
    public final h f47062a;

    public g(h hVar) {
        this.f47062a = hVar;
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        h.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        h hVar = this.f47062a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    long j10 = -hVar.f47066e.f46381c;
                    q5.h hVar2 = hVar.f47074n;
                    if (hVar2 != null) {
                        long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                        q5.h hVar3 = hVar.f47074n;
                        if (hVar3 == null) {
                            return;
                        }
                        hVar3.q(new p(min));
                        return;
                    }
                    return;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    p5.g gVar = hVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    p5.g gVar2 = hVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    long j11 = hVar.f47066e.f46381c;
                    q5.h hVar4 = hVar.f47074n;
                    if (hVar4 != null) {
                        long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                        q5.h hVar5 = hVar.f47074n;
                        if (hVar5 != null) {
                            hVar5.q(new p(min2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hVar.f47068g);
        hVar.f47063a.sendBroadcast(intent);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        q5.h hVar;
        h.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = this.f47062a.f47074n) != null) {
                hVar.r();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void onPause() {
        h.v.b("onPause", new Object[0]);
        q5.h hVar = this.f47062a.f47074n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onPlay() {
        h.v.b("onPlay", new Object[0]);
        q5.h hVar = this.f47062a.f47074n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onSeekTo(long j10) {
        h.v.b("onSeekTo %d", Long.valueOf(j10));
        q5.h hVar = this.f47062a.f47074n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j10));
    }

    @Override
    public final void onSkipToNext() {
        h.v.b("onSkipToNext", new Object[0]);
        q5.h hVar = this.f47062a.f47074n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                q5.h.t();
            } else {
                q5.h.x(new q5.i(hVar, 2));
            }
        }
    }

    @Override
    public final void onSkipToPrevious() {
        h.v.b("onSkipToPrevious", new Object[0]);
        q5.h hVar = this.f47062a.f47074n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                q5.h.t();
            } else {
                q5.h.x(new q5.i(hVar, 1));
            }
        }
    }
}
