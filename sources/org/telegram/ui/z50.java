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
public final class z50 extends org.telegram.ui.Components.ll0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final f60 M;
    public final Context f39961c;
    public int d;
    public int e;
    public int f39962f;
    public int h;
    public int f39963n;
    public int f39964r;
    public int f39965s;
    public int v;
    public int f39966w;
    public int f39967x;
    public int f39968y;

    public z50(f60 f60Var, LaunchActivity launchActivity) {
        this.M = f60Var;
        this.f39961c = launchActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        f60 f60Var = this.M;
        ArrayList arrayList = f60Var.f33162q0;
        ChatObject.Call call = f60Var.f33099a1;
        if (call != null && !call.isScheduled() && !f60Var.f33172s0) {
            this.f39966w = -1;
            this.f39967x = -1;
            this.f39968y = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z10 = false;
            this.F = 0;
            if (f60Var.f33099a1.participants.h(MessageObject.getPeerId(f60Var.A0)) >= 0) {
                z10 = true;
            }
            this.L = z10;
            if (f60Var.o1()) {
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
            if (!arrayList.isEmpty() && f60Var.Q0() && f60Var.f33099a1.call.participants_count > f60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.J = i13;
            }
            this.d = this.F;
            if (!f60Var.r1()) {
                this.F = f60Var.f33099a1.visibleParticipants.size() + this.F;
            }
            this.e = this.F;
            if (!f60Var.f33099a1.invitedUsers.isEmpty() && !f60Var.r1()) {
                int i14 = this.F;
                this.f39962f = i14;
                int size2 = f60Var.f33099a1.invitedUsers.size() + i14;
                this.F = size2;
                this.h = size2;
            } else {
                this.f39962f = -1;
                this.h = -1;
            }
            if (!f60Var.f33099a1.shadyJoinParticipants.isEmpty() && !f60Var.r1()) {
                int i15 = this.F;
                this.f39963n = i15;
                int size3 = f60Var.f33099a1.shadyJoinParticipants.size() + i15;
                this.F = size3;
                this.f39964r = size3;
            } else {
                this.f39963n = -1;
                this.f39964r = -1;
            }
            if (!f60Var.f33099a1.shadyLeftParticipants.isEmpty() && !f60Var.r1()) {
                int i16 = this.F;
                this.f39965s = i16;
                int size4 = f60Var.f33099a1.shadyLeftParticipants.size() + i16;
                this.F = size4;
                this.v = size4;
            } else {
                this.f39965s = -1;
                this.v = -1;
            }
            if (f60Var.o1()) {
                int i17 = this.F;
                this.f39967x = i17;
                this.F = i17 + 2;
                this.f39968y = i17 + 1;
            } else if (!f60Var.r1() && (((!ChatObject.isChannel(f60Var.Z0) || ((chat2 = f60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(f60Var.Z0)) || (ChatObject.isChannel(f60Var.Z0) && (chat = f60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.F;
                this.F = i18 + 1;
                this.f39966w = i18;
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
        if (i10 != this.f39966w && i10 != this.f39967x && i10 != this.f39968y) {
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
    public final void v(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z50.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        p50 p50Var;
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
        f60 f60Var = this.M;
        AccountInstance accountInstance = f60Var.d;
        int i17 = 3;
        Context context = this.f39961c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    p50Var = new View(context);
                                } else {
                                    if (f60Var.f33158p0 == null) {
                                        f60Var.f33158p0 = new q50();
                                    }
                                    p50Var = new p50(context, f60Var.f33158p0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    p50Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    p50Var = textView;
                                }
                            }
                        } else {
                            p50Var = new org.telegram.ui.Components.ln(context, 15);
                        }
                    } else {
                        p50Var = new y50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f21542n = org.telegram.ui.ActionBar.h6.f19054rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18851gg, false));
                    frameLayout.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                    frameLayout.f21538a = w9Var;
                    w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
                    frameLayout.addView(w9Var, w7.x5.d(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
                    org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
                    frameLayout.f21539b = i5Var;
                    i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18980ng, false));
                    i5Var.setTypeface(AndroidUtilities.bold());
                    i5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    i5Var.setGravity(i13 | 48);
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
                    frameLayout.addView(i5Var, w7.x5.d(-1, 20.0f, i19, f11, 10.0f, f12, 0.0f));
                    org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
                    frameLayout.f21540c = i5Var2;
                    i5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    i5Var2.setGravity(i15 | 48);
                    i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, frameLayout.f21542n, false));
                    i5Var2.l(LocaleController.getString(R.string.Invited), false);
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
                    frameLayout.addView(i5Var2, w7.x5.d(-1, 20.0f, i20, f13, 32.0f, f14, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, frameLayout.f21542n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, w7.x5.d(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    p50Var = frameLayout;
                }
            } else {
                p50Var = new w50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f21595n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f21596r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18851gg, false));
            frameLayout2.e = 23;
            org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
            frameLayout2.f21591a = i5Var3;
            i5Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
            i5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            i5Var3.setGravity(i11);
            i5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(i5Var3);
            org.telegram.ui.ActionBar.i5 i5Var4 = new org.telegram.ui.ActionBar.i5(context);
            frameLayout2.f21592b = i5Var4;
            i5Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
            i5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            i5Var4.setGravity(i17);
            i5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(i5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f21593c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18953m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            p50Var = frameLayout2;
        }
        return com.google.android.gms.internal.vision.e2.k(p50Var, p50Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        b50 b50Var = this.M.O;
        int i12 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (b50Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.h6.f19054rg;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f18963mg;
            }
            e4Var.f(i11, org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            e4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (b50Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.h6.f19054rg;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f18963mg;
            }
            w3Var.a(i10, org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            w3Var.setDrawDivider(z10);
        }
    }
}
