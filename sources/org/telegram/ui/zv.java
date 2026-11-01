package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zv implements Runnable {
    public final int f44104a = 0;
    public final boolean f44105b;
    public final long f44106c;
    public final boolean d;
    public final org.telegram.messenger.vs e;
    public final TLObject f44107f;
    public final TLObject h;

    public zv(zx zxVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = zxVar;
        this.f44107f = chat;
        this.f44106c = j10;
        this.f44105b = z10;
        this.h = user;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f44104a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f44107f;
        org.telegram.messenger.vs vsVar = this.e;
        switch (i10) {
            case 0:
                zx zxVar = (zx) vsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f44106c;
                boolean z10 = this.f44105b;
                if (chat != null) {
                    if (org.telegram.messenger.w3.r0(chat)) {
                        zxVar.getMessagesController().X(0, j10, z10);
                    } else {
                        zxVar.getMessagesController().g0(-j10, zxVar.getMessagesController().Z1(Long.valueOf(zxVar.getUserConfig().e())), null, z10, z10);
                    }
                } else {
                    zxVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        zxVar.getMessagesController().w(user.f19943id);
                    }
                }
                zxVar.getMessagesController().J(zxVar.W2);
                return;
            default:
                vh.o8 o8Var = (vh.o8) vsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z11 = this.f44105b;
                long j11 = this.f44106c;
                if (!z11) {
                    th.s0.W = new th.s0(o8Var.f51622b, o8Var.f51626c, storyItem, j11, storyItem.f20032id, z11, inputGroupCall, true, this.d);
                }
                vh.j8 j8Var = o8Var.F;
                if (j8Var != null) {
                    j8Var.f(false);
                }
                o8Var.F = null;
                o8Var.J = 0;
                RectF rectF = o8Var.H;
                Point point = org.telegram.messenger.i0.f16172q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                o8Var.G = org.telegram.messenger.i0.L(8.0f);
                o8Var.p(true);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().U(o8Var.f51622b, storyItem, null);
                org.telegram.messenger.at.f(o8Var.f51626c).k(176, Long.valueOf(inputGroupCall.f19811id));
                return;
        }
    }

    public zv(vh.o8 o8Var, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = o8Var;
        this.f44105b = z10;
        this.f44107f = storyItem;
        this.f44106c = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }
}
