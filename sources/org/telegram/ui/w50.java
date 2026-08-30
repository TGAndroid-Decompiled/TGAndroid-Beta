package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class w50 extends org.telegram.ui.Components.rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final c60 J;
    public final Context f39331c;
    public int d;
    public int e;
    public int f39332f;
    public int h;
    public int f39333n;
    public int f39334r;
    public int f39335s;
    public int v;
    public int f39336w;
    public int f39337x;
    public int f39338y;

    public w50(c60 c60Var, LaunchActivity launchActivity) {
        this.J = c60Var;
        this.f39331c = launchActivity;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        c60 c60Var = this.J;
        ArrayList arrayList = c60Var.f33150n0;
        ChatObject.Call call = c60Var.X0;
        if (call != null && !call.isScheduled() && !c60Var.f33158p0) {
            this.f39336w = -1;
            this.f39337x = -1;
            this.f39338y = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            boolean z4 = false;
            this.C = 0;
            if (c60Var.X0.participants.h(MessageObject.getPeerId(c60Var.f33194x0)) >= 0) {
                z4 = true;
            }
            this.I = z4;
            if (c60Var.o1()) {
                int i10 = this.C;
                this.C = i10 + 1;
                this.H = i10;
            }
            int i11 = this.C;
            this.D = i11;
            int size = arrayList.size() + i11;
            this.C = size;
            this.E = size;
            if (arrayList.size() > 0) {
                int i12 = this.C;
                this.C = i12 + 1;
                this.F = i12;
            }
            if (!arrayList.isEmpty() && c60Var.Q0() && c60Var.X0.call.participants_count > c60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.C;
                this.C = i13 + 1;
                this.G = i13;
            }
            this.d = this.C;
            if (!c60Var.r1()) {
                this.C = c60Var.X0.visibleParticipants.size() + this.C;
            }
            this.e = this.C;
            if (!c60Var.X0.invitedUsers.isEmpty() && !c60Var.r1()) {
                int i14 = this.C;
                this.f39332f = i14;
                int size2 = c60Var.X0.invitedUsers.size() + i14;
                this.C = size2;
                this.h = size2;
            } else {
                this.f39332f = -1;
                this.h = -1;
            }
            if (!c60Var.X0.shadyJoinParticipants.isEmpty() && !c60Var.r1()) {
                int i15 = this.C;
                this.f39333n = i15;
                int size3 = c60Var.X0.shadyJoinParticipants.size() + i15;
                this.C = size3;
                this.f39334r = size3;
            } else {
                this.f39333n = -1;
                this.f39334r = -1;
            }
            if (!c60Var.X0.shadyLeftParticipants.isEmpty() && !c60Var.r1()) {
                int i16 = this.C;
                this.f39335s = i16;
                int size4 = c60Var.X0.shadyLeftParticipants.size() + i16;
                this.C = size4;
                this.v = size4;
            } else {
                this.f39335s = -1;
                this.v = -1;
            }
            if (c60Var.o1()) {
                int i17 = this.C;
                this.f39337x = i17;
                this.C = i17 + 2;
                this.f39338y = i17 + 1;
            } else if (!c60Var.r1() && (((!ChatObject.isChannel(c60Var.W0) || ((chat2 = c60Var.W0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(c60Var.W0)) || (ChatObject.isChannel(c60Var.W0) && (chat = c60Var.W0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.C;
                this.C = i18 + 1;
                this.f39336w = i18;
            }
            int i19 = this.C;
            this.C = i19 + 1;
            this.B = i19;
        }
    }

    @Override
    public final int h() {
        return this.C;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.B) {
            return 3;
        }
        if (i10 != this.f39336w && i10 != this.f39337x && i10 != this.f39338y) {
            if (i10 == this.F) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.e) {
                return 1;
            }
            if (i10 >= this.D && i10 < this.E) {
                return 4;
            }
            if (i10 == this.G) {
                return 6;
            }
            if (i10 == this.H) {
                return 7;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    @Override
    public final void v(f2.l1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w50.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        eg.h0 h0Var;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16;
        float f14;
        float f15;
        c60 c60Var = this.J;
        AccountInstance accountInstance = c60Var.d;
        int i17 = 3;
        Context context = this.f39331c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    h0Var = new View(context);
                                } else {
                                    if (c60Var.m0 == null) {
                                        c60Var.m0 = new n50();
                                    }
                                    h0Var = new eg.h0(context, c60Var.m0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    h0Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    h0Var = textView;
                                }
                            }
                        } else {
                            h0Var = new org.telegram.ui.Components.hn(context, 12);
                        }
                    } else {
                        h0Var = new v50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f22497n = org.telegram.ui.ActionBar.j6.f20166rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970gg, false));
                    frameLayout.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                    frameLayout.f22493a = p9Var;
                    p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
                    boolean z4 = LocaleController.isRTL;
                    if (z4) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z4) {
                        f10 = 0.0f;
                    } else {
                        f10 = 11.0f;
                    }
                    if (z4) {
                        f11 = 11.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    frameLayout.addView(p9Var, k7.b6.d(46, 46.0f, i18, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f22494b = k5Var;
                    k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false));
                    k5Var.setTypeface(AndroidUtilities.bold());
                    k5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    k5Var.setGravity(i13 | 48);
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i19 = i14 | 48;
                    if (z10) {
                        f12 = 54.0f;
                    } else {
                        f12 = 67.0f;
                    }
                    if (z10) {
                        f13 = 67.0f;
                    } else {
                        f13 = 54.0f;
                    }
                    frameLayout.addView(k5Var, k7.b6.d(-1, 20.0f, i19, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f22495c = k5Var2;
                    k5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    k5Var2.setGravity(i15 | 48);
                    k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, frameLayout.f22497n, false));
                    k5Var2.l(LocaleController.getString(R.string.Invited), false);
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    int i20 = i16 | 48;
                    if (z11) {
                        f14 = 54.0f;
                    } else {
                        f14 = 67.0f;
                    }
                    if (z11) {
                        f15 = 67.0f;
                    } else {
                        f15 = 54.0f;
                    }
                    frameLayout.addView(k5Var2, k7.b6.d(-1, 20.0f, i20, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, frameLayout.f22497n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, k7.b6.d(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    h0Var = frameLayout;
                }
            } else {
                h0Var = new t50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f22535n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f22536r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970gg, false));
            frameLayout2.e = 23;
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f22531a = k5Var3;
            k5Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            k5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            k5Var3.setGravity(i11);
            k5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var3);
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f22532b = k5Var4;
            k5Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
            k5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            k5Var4.setGravity(i17);
            k5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f22533c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20067m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            h0Var = frameLayout2;
        }
        return yh.o(h0Var, h0Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11;
        z40 z40Var = this.J.L;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z4 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (z40Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.j6.f20166rg;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20076mg;
            }
            e4Var.f(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            if (l1Var.b() != this.C - 2) {
                z4 = true;
            }
            e4Var.setDrawDivider(z4);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (z40Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.j6.f20166rg;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20076mg;
            }
            v3Var.a(i10, org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            if (l1Var.b() != this.C - 2) {
                z4 = true;
            }
            v3Var.setDrawDivider(z4);
        }
    }
}
