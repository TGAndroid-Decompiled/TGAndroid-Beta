package ug;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.e9;
import c8.na;
import di.bc;
import di.l4;
import di.u9;
import hi.cb;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b61;
import org.telegram.ui.is0;
import org.telegram.ui.vs0;
public class h1 extends ra implements fs {
    public boolean A2;
    public final int[] B2;
    public float C2;
    public boolean D2;
    public ValueAnimator E2;
    public boolean F2;
    public boolean G2;
    public FrameLayout H2;
    public final FrameLayout I2;
    public FrameLayout J2;
    public j80[] K2;
    public j80 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final is0 Z1;
    public int f58796a2;
    public int f58797b2;
    public int f58798c2;
    public int d2;
    public int f58799e2;
    public int f58800f2;
    public int f58801g2;
    public int f58802h2;
    public int f58803i2;
    public int f58804j2;
    public final tz f58805k2;
    public final a1 f58806l2;
    public ki.e f58807m2;
    public bc f58808n2;
    public b61 f58809o2;
    public final g2 f58810p2;
    public Integer f58811q2;
    public float f58812r2;
    public float f58813s2;
    public float f58814t2;
    public float f58815u2;
    public float f58816v2;
    public View f58817w2;
    public View f58818x2;
    public TLRPC.InputStickerSet f58819y2;
    public TLRPC.TL_emojiStatusCollectible f58820z2;

    public h1(g2 g2Var, int i7, TLRPC.User user, i6 i6Var) {
        this(g2Var, i7, user, null, null, i6Var);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new l4(this, 11);
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131743986, null);
    }

    @Override
    public final void T0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i11 < arrayList.size()) {
                is0 is0Var = this.Z1;
                is0Var.a((vs0) arrayList.get(i11), false);
                is0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((vs0) arrayList.get(i11)).f53026e = i12;
                i12 += is0Var.getMeasuredHeight();
                i11++;
            } else {
                this.f58796a2 = i12;
                this.f30229c.getLocationOnScreen(this.B2);
                return;
            }
        }
    }

    @Override
    public final void V0(cu0 cu0Var) {
        this.U1 = i10.f24637t0;
        r0 r0Var = new r0(getContext(), this.J0, false);
        r0Var.b(PremiumPreviewFragment.t0(this.U1, null), new tg.a0(this, 3), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        u6.h(n6.f29452d7, view, this.J0);
        this.H2.addView(view, na.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.X3(view, true, 1.0f, true, false);
        if (!i10.i(this.U1).q() && !(this instanceof wg.i0)) {
            this.H2.addView(r0Var, na.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            u6.h(n6.f29524h5, this.H2, this.J0);
            cu0Var.addView(this.H2, na.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f58818x2;
        if (view2 != null) {
            if (this.D2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f58817w2 != null && this.D2) {
            View view3 = this.f58818x2;
            if (view3 == null) {
                view = this.f58808n2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f58812r2, this.f58813s2};
            this.f58817w2.getMatrix().mapPoints(fArr);
            View view4 = this.f58817w2;
            if (view4 instanceof n5) {
                drawable = ((n5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.r1) {
                drawable = ((org.telegram.ui.Cells.r1) view4).f31625qa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B2;
            float f10 = (-iArr[0]) + this.f58814t2 + fArr[0];
            float f11 = (-iArr[1]) + this.f58815u2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f58810p2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f58816v2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f30229c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, kr.h.getInterpolation(this.C2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
            float f14 = this.f58816v2;
            float f15 = this.C2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, i10, drawable), org.telegram.ui.Cells.c0.A(2, i11, drawable), org.telegram.ui.Cells.c0.y(2, i10, drawable), org.telegram.ui.Cells.c0.j(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.C2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.C2);
            canvas.scale(T13, T13, T1, T12);
            m10.k(view.getMeasuredHeight(), 2.0f, T12, T1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ks.B0 && (inputStickerSet = this.f58819y2) != null && inputStickerSet.f28512id == ((Long) objArr[0]).longValue()) {
            k1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ks.e().k(ks.f25239k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        tz tzVar = this.f58805k2;
        if (tzVar.f40196c) {
            tzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void f1(b61 b61Var) {
        b61Var.addView(this.f58818x2, na.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int g1() {
        return 0;
    }

    public View i1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder j1(String str) {
        Integer num = this.f58811q2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, n6.f29767u6, this.J0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void k1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        j80[] j80VarArr = this.K2;
        if (j80VarArr != null && this.L2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f58820z2;
            TLRPC.User user = this.V1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K2[0].setText(org.telegram.messenger.g0.T2(gd.a0(null, null, 2131743974, org.telegram.messenger.n5.u(user), str2), new c1(this, 0)));
                this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743972, null)));
            } else if (this.f58819y2 != null) {
                CharSequence j12 = j1(gd.a0(null, null, 2131743971, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    j12 = j6.m(j12, this.K2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (j12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) j12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(j12);
                }
                int indexOf = j12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet o02 = ri.d0(this.U1).o0(this.f58819y2, false);
                    if (o02 != null && !o02.documents.isEmpty()) {
                        document = o02.documents.get(0);
                        if (o02.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= o02.documents.size()) {
                                    break;
                                } else if (o02.documents.get(i7).f28498id == o02.set.thumb_document_id) {
                                    document = o02.documents.get(i7);
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new x5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (o02 != null && o02.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) o02.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new o80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new cb(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K2[1].setOnLinkPressListener(new i80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            h1 h1Var = h1.this;
                            arrayList.add(h1Var.f58819y2);
                            e9 e9Var = new e9(h1Var, 12);
                            g2 g2Var = h1Var.f58810p2;
                            if (g2Var != null) {
                                e9Var.setParentFragment(g2Var);
                            }
                            new f1(h1Var, e9Var, h1Var.getContext(), h1Var.J0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        j80[] j80VarArr2 = this.K2;
                        if (j80VarArr2 != null) {
                            j80VarArr2[1].setText(spannableStringBuilder);
                            if (this.K2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K2[1].setAlpha(0.0f);
                                    this.K2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                    kr krVar = kr.f36858f;
                                    m10.o(alpha, krVar, 200L);
                                    this.K2[0].animate().alpha(0.0f).setInterpolator(krVar).setDuration(200L).withEndAction(new c1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new e1(this, 1));
                                    ofFloat.setInterpolator(krVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.K2[1].setAlpha(1.0f);
                                    this.K2[1].setVisibility(0);
                                    this.K2[0].setAlpha(0.0f);
                                    this.K2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.K2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743972, null)));
            } else if (this.A2) {
                j80VarArr[0].setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743973, i5.m(0, user.first_name, user.last_name))));
                this.L2.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743972, i5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.W1;
                if (jVar != null) {
                    if (this.Y1) {
                        j80 j80Var = j80VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        j80Var.setText(j1(gd.a0(null, null, 2131743975, str, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        j80 j80Var2 = this.L2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        j80Var2.setText(j1(gd.a0(null, null, 2131743976, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f28641id != 777000) {
                        this.K2[0].setText(j1(gd.a0(null, null, 2131743978, user.first_name, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743979, null)));
                    } else {
                        this.K2[0].setText(j1(gd.a0(null, null, 2131743977, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743979, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.X1;
                    if (starGift != null) {
                        j80VarArr[0].setText(gd.N0(2131750051, null));
                        this.K2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L2.setText(org.telegram.messenger.g0.W2(gd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131750055, null)));
                        }
                        this.L2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        j80VarArr[0].setText(gd.N0(2131743986, null));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743984, null)));
                    } else {
                        j80VarArr[0].setText(j1(gd.a0(null, null, 2131743980, i5.m(0, user.first_name, user.last_name))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.N0(2131743981, null)));
                    }
                }
            }
            try {
                j80 j80Var3 = this.K2[0];
                j80Var3.setText(j6.m(j80Var3.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void l1() {
        int i7 = this.f58797b2;
        int i10 = i7 + 1;
        this.f58797b2 = i10;
        this.f58798c2 = i7;
        this.f58800f2 = i10;
        int size = this.T1.size() + i10;
        this.f58801g2 = size;
        this.f58797b2 = size + 1;
        this.f58802h2 = size;
        if (!i10.i(this.U1).q() && this.W1 == null) {
            int i11 = this.f58797b2;
            this.f58797b2 = i11 + 1;
            this.f58803i2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f58817w2 == null) {
            return false;
        }
        this.E2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C2 = 0.0f;
        this.D2 = true;
        this.f58809o2.invalidate();
        View view = this.f58817w2;
        if (view instanceof n5) {
            drawable = ((n5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            m5 m5Var = r1Var.f31625qa;
            r1Var.q2();
            drawable = m5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f58817w2;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view2).q2();
        } else {
            view2.invalidate();
        }
        bc bcVar = this.f58808n2;
        if (bcVar != null) {
            bcVar.m(100L);
        }
        this.E2.addUpdateListener(new e1(this, 0));
        this.E2.addListener(new f10(23, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(kr.h);
        this.E2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(i10.f24637t0).c(this, ks.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(i10.f24637t0).n(this, ks.B0);
    }

    @Override
    public final void show() {
        super.show();
        ks.e().k(ks.f25234j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.h3(new c1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        bc bcVar = this.f58808n2;
        if (bcVar != null) {
            bcVar.setDialogVisible(true);
        }
        this.f58807m2.setPaused(true);
        dialog.setOnDismissListener(new u9(this, 14));
        dialog.show();
        return true;
    }

    public h1(g2 g2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, i6 i6Var) {
        super(g2Var, false, false, i6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.f58810p2 = g2Var;
        this.f39253v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new is0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || i10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        a1 a1Var = new a1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, null);
        this.f58806l2 = a1Var;
        a1Var.f58733m = true;
        a1Var.f58735o = 1.0f;
        a1Var.f58736p = 0.0f;
        a1Var.f58737q = 0.0f;
        a1Var.f58724b = 0.0f;
        a1Var.f58725c = 0.0f;
        l1();
        this.f39246o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f39246o1.setOnItemClickListener(new wl0(this, i7, g2Var, 1));
        ri.d0(i7).r1();
        PremiumPreviewFragment.w0("profile");
        tz tzVar = new tz(getContext());
        this.f58805k2 = tzVar;
        this.f30229c.addView(tzVar, na.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.f30226b.addView(frameLayout, na.e(-1, 140, 87));
    }

    public void h1(View view) {
    }

    public void e1(int i7, View view) {
    }
}
