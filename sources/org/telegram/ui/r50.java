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
public final class r50 extends org.telegram.ui.Components.mm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final x50 M;
    public final Context f42848c;
    public int d;
    public int e;
    public int f42849f;
    public int h;
    public int f42850n;
    public int f42851r;
    public int f42852s;
    public int v;
    public int f42853w;
    public int f42854x;
    public int f42855y;

    public r50(x50 x50Var, LaunchActivity launchActivity) {
        this.M = x50Var;
        this.f42848c = launchActivity;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        x50 x50Var = this.M;
        ArrayList arrayList = x50Var.f45555q0;
        ChatObject.Call call = x50Var.f45491a1;
        if (call != null && !call.isScheduled() && !x50Var.f45565s0) {
            this.f42853w = -1;
            this.f42854x = -1;
            this.f42855y = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z10 = false;
            this.F = 0;
            if (x50Var.f45491a1.participants.h(MessageObject.getPeerId(x50Var.A0)) >= 0) {
                z10 = true;
            }
            this.L = z10;
            if (x50Var.o1()) {
                int i10 = this.F;
                this.F = i10 + 1;
                this.K = i10;
            }
            int i11 = this.F;
            this.G = i11;
            int size = arrayList.size() + i11;
            this.F = size;
            this.H = size;
            if (arrayList.size() > 0) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.I = i12;
            }
            if (!arrayList.isEmpty() && x50Var.Q0() && x50Var.f45491a1.call.participants_count > x50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.J = i13;
            }
            this.d = this.F;
            if (!x50Var.r1()) {
                this.F = x50Var.f45491a1.visibleParticipants.size() + this.F;
            }
            this.e = this.F;
            if (!x50Var.f45491a1.invitedUsers.isEmpty() && !x50Var.r1()) {
                int i14 = this.F;
                this.f42849f = i14;
                int size2 = x50Var.f45491a1.invitedUsers.size() + i14;
                this.F = size2;
                this.h = size2;
            } else {
                this.f42849f = -1;
                this.h = -1;
            }
            if (!x50Var.f45491a1.shadyJoinParticipants.isEmpty() && !x50Var.r1()) {
                int i15 = this.F;
                this.f42850n = i15;
                int size3 = x50Var.f45491a1.shadyJoinParticipants.size() + i15;
                this.F = size3;
                this.f42851r = size3;
            } else {
                this.f42850n = -1;
                this.f42851r = -1;
            }
            if (!x50Var.f45491a1.shadyLeftParticipants.isEmpty() && !x50Var.r1()) {
                int i16 = this.F;
                this.f42852s = i16;
                int size4 = x50Var.f45491a1.shadyLeftParticipants.size() + i16;
                this.F = size4;
                this.v = size4;
            } else {
                this.f42852s = -1;
                this.v = -1;
            }
            if (x50Var.o1()) {
                int i17 = this.F;
                this.f42854x = i17;
                this.F = i17 + 2;
                this.f42855y = i17 + 1;
            } else if (!x50Var.r1() && (((!ChatObject.isChannel(x50Var.Z0) || ((chat2 = x50Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(x50Var.Z0)) || (ChatObject.isChannel(x50Var.Z0) && (chat = x50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.F;
                this.F = i18 + 1;
                this.f42853w = i18;
            }
            int i19 = this.F;
            this.F = i19 + 1;
            this.E = i19;
        }
    }

    @Override
    public final int h() {
        return this.F;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.E) {
            return 3;
        }
        if (i10 != this.f42853w && i10 != this.f42854x && i10 != this.f42855y) {
            if (i10 == this.I) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.e) {
                return 1;
            }
            if (i10 >= this.G && i10 < this.H) {
                return 4;
            }
            if (i10 == this.J) {
                return 6;
            }
            if (i10 == this.K) {
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
    public final void v(s4.e1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        b20 b20Var;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        x50 x50Var = this.M;
        AccountInstance accountInstance = x50Var.d;
        int i17 = 3;
        Context context = this.f42848c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    b20Var = new View(context);
                                } else {
                                    if (x50Var.f45551p0 == null) {
                                        x50Var.f45551p0 = new h50();
                                    }
                                    b20Var = new b20(context, x50Var.f45551p0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    b20Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    b20Var = textView;
                                }
                            }
                        } else {
                            b20Var = new org.telegram.ui.Components.vn(context, 15);
                        }
                    } else {
                        b20Var = new q50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f23852n = org.telegram.ui.ActionBar.y6.f23625rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false));
                    frameLayout.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    frameLayout.f23848a = y9Var;
                    y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 11.0f;
                    }
                    if (z10) {
                        f10 = 11.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.h(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
                    org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
                    frameLayout.f23849b = b6Var;
                    org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23551ng, null);
                    b6Var.setTypeface(AndroidUtilities.bold());
                    b6Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    b6Var.setGravity(i13 | 48);
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i19 = i14 | 48;
                    if (z11) {
                        f11 = 54.0f;
                    } else {
                        f11 = 67.0f;
                    }
                    if (z11) {
                        f12 = 67.0f;
                    } else {
                        f12 = 54.0f;
                    }
                    frameLayout.addView(b6Var, org.telegram.ui.Components.kb1.h(-1, 20.0f, i19, f11, 10.0f, f12, 0.0f));
                    org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
                    frameLayout.f23850c = b6Var2;
                    b6Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    b6Var2.setGravity(i15 | 48);
                    b6Var2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, frameLayout.f23852n, false));
                    b6Var2.l(LocaleController.getString(R.string.Invited), false);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    int i20 = i16 | 48;
                    if (z12) {
                        f13 = 54.0f;
                    } else {
                        f13 = 67.0f;
                    }
                    if (z12) {
                        f14 = 67.0f;
                    } else {
                        f14 = 54.0f;
                    }
                    frameLayout.addView(b6Var2, org.telegram.ui.Components.kb1.h(-1, 20.0f, i20, f13, 32.0f, f14, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, frameLayout.f23852n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    b20Var = frameLayout;
                }
            } else {
                b20Var = new o50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f23903n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f23904r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false));
            frameLayout2.e = 23;
            org.telegram.ui.ActionBar.b6 b6Var3 = new org.telegram.ui.ActionBar.b6(context);
            frameLayout2.f23899a = b6Var3;
            org.telegram.ui.ActionBar.f7.Y(b6Var3, org.telegram.ui.ActionBar.y6.G6, null);
            b6Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            b6Var3.setGravity(i11);
            b6Var3.setImportantForAccessibility(2);
            frameLayout2.addView(b6Var3);
            org.telegram.ui.ActionBar.b6 b6Var4 = new org.telegram.ui.ActionBar.b6(context);
            frameLayout2.f23900b = b6Var4;
            org.telegram.ui.ActionBar.f7.Y(b6Var4, org.telegram.ui.ActionBar.y6.I6, null);
            b6Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            b6Var4.setGravity(i17);
            b6Var4.setImportantForAccessibility(2);
            frameLayout2.addView(b6Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f23901c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23521m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            b20Var = frameLayout2;
        }
        return ic.a.n(b20Var, b20Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10;
        int i11;
        t40 t40Var = this.M.O;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (t40Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.y6.f23625rg;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23531mg;
            }
            i4Var.f(i11, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            if (e1Var.b() != this.F - 2) {
                z10 = true;
            }
            i4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
            if (t40Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.y6.f23625rg;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23531mg;
            }
            a4Var.a(i10, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            if (e1Var.b() != this.F - 2) {
                z10 = true;
            }
            a4Var.setDrawDivider(z10);
        }
    }
}
