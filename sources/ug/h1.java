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
import hi.ia;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d61;
import org.telegram.ui.ks0;
import org.telegram.ui.xs0;
public class h1 extends sa implements gs {
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
    public m80[] K2;
    public m80 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final ks0 Z1;
    public int f58681a2;
    public int f58682b2;
    public int f58683c2;
    public int d2;
    public int f58684e2;
    public int f58685f2;
    public int f58686g2;
    public int f58687h2;
    public int f58688i2;
    public int f58689j2;
    public final wz f58690k2;
    public final a1 f58691l2;
    public ki.e f58692m2;
    public bc f58693n2;
    public d61 f58694o2;
    public final g2 f58695p2;
    public Integer f58696q2;
    public float f58697r2;
    public float f58698s2;
    public float f58699t2;
    public float f58700u2;
    public float f58701v2;
    public View f58702w2;
    public View f58703x2;
    public TLRPC.InputStickerSet f58704y2;
    public TLRPC.TL_emojiStatusCollectible f58705z2;

    public h1(g2 g2Var, int i7, TLRPC.User user, h6 h6Var) {
        this(g2Var, i7, user, null, null, h6Var);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new l4(this, 11);
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131743990, null);
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
                ks0 ks0Var = this.Z1;
                ks0Var.a((xs0) arrayList.get(i11), false);
                ks0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((xs0) arrayList.get(i11)).f53921e = i12;
                i12 += ks0Var.getMeasuredHeight();
                i11++;
            } else {
                this.f58681a2 = i12;
                this.f30145c.getLocationOnScreen(this.B2);
                return;
            }
        }
    }

    @Override
    public final void V0(du0 du0Var) {
        this.U1 = k10.f24932t0;
        r0 r0Var = new r0(getContext(), this.J0, false);
        r0Var.b(PremiumPreviewFragment.t0(this.U1, null), new tg.u(this, 3), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        t6.h(m6.f29348d7, view, this.J0);
        this.H2.addView(view, na.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.X3(view, true, 1.0f, true, false);
        if (!k10.i(this.U1).q() && !(this instanceof wg.j0)) {
            this.H2.addView(r0Var, na.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            t6.h(m6.f29420h5, this.H2, this.J0);
            du0Var.addView(this.H2, na.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f58703x2;
        if (view2 != null) {
            if (this.D2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f58702w2 != null && this.D2) {
            View view3 = this.f58703x2;
            if (view3 == null) {
                view = this.f58693n2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f58697r2, this.f58698s2};
            this.f58702w2.getMatrix().mapPoints(fArr);
            View view4 = this.f58702w2;
            if (view4 instanceof m5) {
                drawable = ((m5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.r1) {
                drawable = ((org.telegram.ui.Cells.r1) view4).f31541qa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B2;
            float f10 = (-iArr[0]) + this.f58699t2 + fArr[0];
            float f11 = (-iArr[1]) + this.f58700u2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f58695p2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f58701v2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f30145c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, nr.h.getInterpolation(this.C2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
            float f14 = this.f58701v2;
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
            o10.k(view.getMeasuredHeight(), 2.0f, T12, T1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ls.B0 && (inputStickerSet = this.f58704y2) != null && inputStickerSet.f28418id == ((Long) objArr[0]).longValue()) {
            k1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ls.e().k(ls.f25298k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wz wzVar = this.f58690k2;
        if (wzVar.f41881c) {
            wzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void f1(d61 d61Var) {
        d61Var.addView(this.f58703x2, na.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int g1() {
        return 0;
    }

    public View i1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder j1(String str) {
        Integer num = this.f58696q2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, m6.f29663u6, this.J0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void k1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        m80[] m80VarArr = this.K2;
        if (m80VarArr != null && this.L2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f58705z2;
            TLRPC.User user = this.V1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K2[0].setText(org.telegram.messenger.g0.T2(hd.a0(null, null, 2131743978, n5.u(user), str2), new c1(this, 0)));
                this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743976, null)));
            } else if (this.f58704y2 != null) {
                CharSequence j12 = j1(hd.a0(null, null, 2131743975, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
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
                    TLRPC.TL_messages_stickerSet o02 = si.d0(this.U1).o0(this.f58704y2, false);
                    if (o02 != null && !o02.documents.isEmpty()) {
                        document = o02.documents.get(0);
                        if (o02.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= o02.documents.size()) {
                                    break;
                                } else if (o02.documents.get(i7).f28404id == o02.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new y5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (o02 != null && o02.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) o02.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new r80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ia(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K2[1].setOnLinkPressListener(new l80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            h1 h1Var = h1.this;
                            arrayList.add(h1Var.f58704y2);
                            e9 e9Var = new e9(h1Var, 12);
                            g2 g2Var = h1Var.f58695p2;
                            if (g2Var != null) {
                                e9Var.setParentFragment(g2Var);
                            }
                            new f1(h1Var, e9Var, h1Var.getContext(), h1Var.J0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        m80[] m80VarArr2 = this.K2;
                        if (m80VarArr2 != null) {
                            m80VarArr2[1].setText(spannableStringBuilder);
                            if (this.K2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K2[1].setAlpha(0.0f);
                                    this.K2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                    nr nrVar = nr.f37917f;
                                    o10.o(alpha, nrVar, 200L);
                                    this.K2[0].animate().alpha(0.0f).setInterpolator(nrVar).setDuration(200L).withEndAction(new c1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new e1(this, 1));
                                    ofFloat.setInterpolator(nrVar);
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
                this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743976, null)));
            } else if (this.A2) {
                m80VarArr[0].setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743977, i5.m(0, user.first_name, user.last_name))));
                this.L2.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743976, i5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.W1;
                if (jVar != null) {
                    if (this.Y1) {
                        m80 m80Var = m80VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        m80Var.setText(j1(hd.a0(null, null, 2131743979, str, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        m80 m80Var2 = this.L2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        m80Var2.setText(j1(hd.a0(null, null, 2131743980, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f28547id != 777000) {
                        this.K2[0].setText(j1(hd.a0(null, null, 2131743982, user.first_name, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743983, null)));
                    } else {
                        this.K2[0].setText(j1(hd.a0(null, null, 2131743981, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743983, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.X1;
                    if (starGift != null) {
                        m80VarArr[0].setText(hd.N0(2131750051, null));
                        this.K2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L2.setText(org.telegram.messenger.g0.W2(hd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131750055, null)));
                        }
                        this.L2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        m80VarArr[0].setText(hd.N0(2131743990, null));
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743988, null)));
                    } else {
                        m80VarArr[0].setText(j1(hd.a0(null, null, 2131743984, i5.m(0, user.first_name, user.last_name))));
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743985, null)));
                    }
                }
            }
            try {
                m80 m80Var3 = this.K2[0];
                m80Var3.setText(j6.m(m80Var3.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void l1() {
        int i7 = this.f58682b2;
        int i10 = i7 + 1;
        this.f58682b2 = i10;
        this.f58683c2 = i7;
        this.f58685f2 = i10;
        int size = this.T1.size() + i10;
        this.f58686g2 = size;
        this.f58682b2 = size + 1;
        this.f58687h2 = size;
        if (!k10.i(this.U1).q() && this.W1 == null) {
            int i11 = this.f58682b2;
            this.f58682b2 = i11 + 1;
            this.f58688i2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f58702w2 == null) {
            return false;
        }
        this.E2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C2 = 0.0f;
        this.D2 = true;
        this.f58694o2.invalidate();
        View view = this.f58702w2;
        if (view instanceof m5) {
            drawable = ((m5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            org.telegram.ui.Components.n5 n5Var = r1Var.f31541qa;
            r1Var.q2();
            drawable = n5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f58702w2;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view2).q2();
        } else {
            view2.invalidate();
        }
        bc bcVar = this.f58693n2;
        if (bcVar != null) {
            bcVar.m(100L);
        }
        this.E2.addUpdateListener(new e1(this, 0));
        this.E2.addListener(new h10(23, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(nr.h);
        this.E2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(k10.f24932t0).c(this, ls.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(k10.f24932t0).n(this, ls.B0);
    }

    @Override
    public final void show() {
        super.show();
        ls.e().k(ls.f25293j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.h3(new c1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        bc bcVar = this.f58693n2;
        if (bcVar != null) {
            bcVar.setDialogVisible(true);
        }
        this.f58692m2.setPaused(true);
        dialog.setOnDismissListener(new u9(this, 14));
        dialog.show();
        return true;
    }

    public h1(g2 g2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, h6 h6Var) {
        super(g2Var, false, false, h6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.f58695p2 = g2Var;
        this.f39494v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new ks0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || k10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        a1 a1Var = new a1(m6.Ck, m6.Dk, m6.Ek, m6.Fk, null);
        this.f58691l2 = a1Var;
        a1Var.f58618m = true;
        a1Var.f58620o = 1.0f;
        a1Var.f58621p = 0.0f;
        a1Var.f58622q = 0.0f;
        a1Var.f58609b = 0.0f;
        a1Var.f58610c = 0.0f;
        l1();
        this.f39487o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f39487o1.setOnItemClickListener(new wl0(this, i7, g2Var, 1));
        si.d0(i7).r1();
        PremiumPreviewFragment.w0("profile");
        wz wzVar = new wz(getContext());
        this.f58690k2 = wzVar;
        this.f30145c.addView(wzVar, na.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.f30142b.addView(frameLayout, na.e(-1, 140, 87));
    }

    public void h1(View view) {
    }

    public void e1(int i7, View view) {
    }
}
