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
import bi.eb;
import bi.k5;
import bi.qd;
import bi.w4;
import c8.ha;
import fi.ka;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c61;
import org.telegram.ui.hs0;
import org.telegram.ui.us0;
public class f1 extends na implements ls {
    public ValueAnimator A2;
    public boolean B2;
    public boolean C2;
    public FrameLayout D2;
    public final FrameLayout E2;
    public FrameLayout F2;
    public w70[] G2;
    public w70 H2;
    public final ArrayList P1;
    public int Q1;
    public final TLRPC.User R1;
    public final j S1;
    public final TL_stars.StarGift T1;
    public boolean U1;
    public final hs0 V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int f56446a2;
    public int f56447b2;
    public int f56448c2;
    public int d2;
    public int f56449e2;
    public int f56450f2;
    public final jz f56451g2;
    public final y0 f56452h2;
    public hi.e f56453i2;
    public qd f56454j2;
    public c61 f56455k2;
    public final f2 f56456l2;
    public Integer f56457m2;
    public float f56458n2;
    public float f56459o2;
    public float f56460p2;
    public float f56461q2;
    public float f56462r2;
    public View f56463s2;
    public View f56464t2;
    public TLRPC.InputStickerSet f56465u2;
    public TLRPC.TL_emojiStatusCollectible f56466v2;
    public boolean f56467w2;
    public final int[] f56468x2;
    public float f56469y2;
    public boolean f56470z2;

    public f1(f2 f2Var, int i7, TLRPC.User user, f6 f6Var) {
        this(f2Var, i7, user, null, null, f6Var);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new k5(this, 10);
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131744232, null);
    }

    @Override
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.P1;
            if (i11 < arrayList.size()) {
                hs0 hs0Var = this.V1;
                hs0Var.a((us0) arrayList.get(i11), false);
                hs0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((us0) arrayList.get(i11)).f50488e = i12;
                i12 += hs0Var.getMeasuredHeight();
                i11++;
            } else {
                this.W1 = i12;
                this.f28618c.getLocationOnScreen(this.f56468x2);
                return;
            }
        }
    }

    @Override
    public final void U0(rt0 rt0Var) {
        this.Q1 = p10.f24459s0;
        p0 p0Var = new p0(getContext(), this.I0, false);
        p0Var.b(PremiumPreviewFragment.t0(this.Q1, null), new ii.g(this, 26), false);
        this.D2 = new FrameLayout(getContext());
        View view = new View(getContext());
        r6.i(k6.f27849d7, view, this.I0);
        this.D2.addView(view, ha.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (!p10.i(this.Q1).q() && !(this instanceof wg.j0)) {
            this.D2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            r6.i(k6.f27921h5, this.D2, this.I0);
            rt0Var.addView(this.D2, ha.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f56464t2;
        if (view2 != null) {
            if (this.f56470z2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f56463s2 != null && this.f56470z2) {
            View view3 = this.f56464t2;
            if (view3 == null) {
                view = this.f56454j2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f56458n2, this.f56459o2};
            this.f56463s2.getMatrix().mapPoints(fArr);
            View view4 = this.f56463s2;
            if (view4 instanceof org.telegram.ui.ActionBar.k5) {
                drawable = ((org.telegram.ui.ActionBar.k5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.q1) {
                drawable = ((org.telegram.ui.Cells.q1) view4).f29963pa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.f56468x2;
            float f10 = (-iArr[0]) + this.f56460p2 + fArr[0];
            float f11 = (-iArr[1]) + this.f56461q2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f56456l2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f56462r2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f28618c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, xq.h.getInterpolation(this.f56469y2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.f56469y2);
            float f14 = this.f56462r2;
            float f15 = this.f56469y2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, i10, drawable), org.telegram.ui.Cells.f1.y(2, i11, drawable), org.telegram.ui.Cells.f1.w(2, i10, drawable), org.telegram.ui.Cells.f1.f(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.f56469y2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.f56469y2);
            canvas.scale(T13, T13, T1, T12);
            canvas.translate(T1 - (view.getMeasuredWidth() / 2.0f), T12 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == qs.B0 && (inputStickerSet = this.f56465u2) != null && inputStickerSet.f26972id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qs.e().k(qs.f25009k1, 4);
        ValueAnimator valueAnimator = this.A2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        jz jzVar = this.f56451g2;
        if (jzVar.f35122c) {
            jzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(c61 c61Var) {
        c61Var.addView(this.f56464t2, ha.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.f56457m2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, k6.f28164u6, this.I0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z9) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        w70[] w70VarArr = this.G2;
        if (w70VarArr != null && this.H2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f56466v2;
            TLRPC.User user = this.R1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.G2[0].setText(org.telegram.messenger.g0.U2(hd.a0(null, null, 2131744220, m5.u(user), str2), new a1(this, 0)));
                this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744218, null)));
            } else if (this.f56465u2 != null) {
                CharSequence i12 = i1(hd.a0(null, null, 2131744217, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    i12 = i6.m(i12, this.G2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (i12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) i12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(i12);
                }
                int indexOf = i12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet m0 = ui.b0(this.Q1).m0(this.f56465u2, false);
                    if (m0 != null && !m0.documents.isEmpty()) {
                        document = m0.documents.get(0);
                        if (m0.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= m0.documents.size()) {
                                    break;
                                } else if (m0.documents.get(i7).f26958id == m0.set.thumb_document_id) {
                                    document = m0.documents.get(i7);
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
                        spannableStringBuilder2.setSpan(new r5(document, this.G2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (m0 != null && m0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) m0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new b80(org.telegram.messenger.g0.L(100.0f), this.G2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ka(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.G2[1].setOnLinkPressListener(new v70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            f1 f1Var = f1.this;
                            arrayList.add(f1Var.f56465u2);
                            w4 w4Var = new w4(f1Var, 11);
                            f2 f2Var = f1Var.f56456l2;
                            if (f2Var != null) {
                                w4Var.setParentFragment(f2Var);
                            }
                            new d1(f1Var, w4Var, f1Var.getContext(), f1Var.I0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        w70[] w70VarArr2 = this.G2;
                        if (w70VarArr2 != null) {
                            w70VarArr2[1].setText(spannableStringBuilder);
                            if (this.G2[1].getVisibility() != 0) {
                                if (z9) {
                                    this.G2[1].setAlpha(0.0f);
                                    this.G2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.G2[1].animate().alpha(1.0f);
                                    xq xqVar = xq.f40310f;
                                    org.telegram.messenger.camera.q.l(alpha, xqVar, 200L);
                                    this.G2[0].animate().alpha(0.0f).setInterpolator(xqVar).setDuration(200L).withEndAction(new a1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new c1(this, 1));
                                    ofFloat.setInterpolator(xqVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.G2[1].setAlpha(1.0f);
                                    this.G2[1].setVisibility(0);
                                    this.G2[0].setAlpha(0.0f);
                                    this.G2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.G2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744218, null)));
            } else if (this.f56467w2) {
                w70VarArr[0].setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744219, g5.m(0, user.first_name, user.last_name))));
                this.H2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744218, g5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.S1;
                if (jVar != null) {
                    if (this.U1) {
                        w70 w70Var = w70VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        w70Var.setText(i1(hd.a0(null, null, 2131744221, str, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        w70 w70Var2 = this.H2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        w70Var2.setText(i1(hd.a0(null, null, 2131744222, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f27101id != 777000) {
                        this.G2[0].setText(i1(hd.a0(null, null, 2131744224, user.first_name, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744225, null)));
                    } else {
                        this.G2[0].setText(i1(hd.a0(null, null, 2131744223, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744225, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.T1;
                    if (starGift != null) {
                        w70VarArr[0].setText(hd.M0(2131750067, null));
                        this.G2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.H2.setText(org.telegram.messenger.g0.X2(hd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131750071, null)));
                        }
                        this.H2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        w70VarArr[0].setText(hd.M0(2131744232, null));
                        this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744230, null)));
                    } else {
                        w70VarArr[0].setText(i1(hd.a0(null, null, 2131744226, g5.m(0, user.first_name, user.last_name))));
                        this.H2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744227, null)));
                    }
                }
            }
            try {
                w70 w70Var3 = this.G2[0];
                w70Var3.setText(i6.m(w70Var3.getText(), this.G2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void k1() {
        int i7 = this.X1;
        int i10 = i7 + 1;
        this.X1 = i10;
        this.Y1 = i7;
        this.f56447b2 = i10;
        int size = this.P1.size() + i10;
        this.f56448c2 = size;
        this.X1 = size + 1;
        this.d2 = size;
        if (!p10.i(this.Q1).q() && this.S1 == null) {
            int i11 = this.X1;
            this.X1 = i11 + 1;
            this.f56449e2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f56463s2 == null) {
            return false;
        }
        this.A2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f56469y2 = 0.0f;
        this.f56470z2 = true;
        this.f56455k2.invalidate();
        View view = this.f56463s2;
        if (view instanceof org.telegram.ui.ActionBar.k5) {
            drawable = ((org.telegram.ui.ActionBar.k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.ui.Components.g5 g5Var = q1Var.f29963pa;
            q1Var.p2();
            drawable = g5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f56463s2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        qd qdVar = this.f56454j2;
        if (qdVar != null) {
            qdVar.m(100L);
        }
        this.A2.addUpdateListener(new c1(this, 0));
        this.A2.addListener(new v50(23, this, drawable));
        this.A2.setDuration(600L);
        this.A2.setInterpolator(xq.h);
        this.A2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(p10.f24459s0).c(this, qs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(p10.f24459s0).n(this, qs.B0);
    }

    @Override
    public final void show() {
        super.show();
        qs.e().k(qs.f25004j1, 4);
        if (this.B2) {
            org.telegram.messenger.g0.i3(new a1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        qd qdVar = this.f56454j2;
        if (qdVar != null) {
            qdVar.setDialogVisible(true);
        }
        this.f56453i2.setPaused(true);
        dialog.setOnDismissListener(new eb(this, 14));
        dialog.show();
        return true;
    }

    public f1(f2 f2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(f2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.P1 = arrayList;
        this.f56468x2 = new int[2];
        this.f56469y2 = 0.0f;
        N();
        this.f56456l2 = f2Var;
        this.f36333r1 = 0.26f;
        this.R1 = user;
        this.Q1 = i7;
        this.S1 = jVar;
        this.T1 = starGift;
        this.V1 = new hs0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || p10.i(i7).q()) {
            this.D2.setVisibility(8);
        }
        y0 y0Var = new y0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.f56452h2 = y0Var;
        y0Var.f56758m = true;
        y0Var.f56760o = 1.0f;
        y0Var.f56761p = 0.0f;
        y0Var.f56762q = 0.0f;
        y0Var.f56749b = 0.0f;
        y0Var.f56750c = 0.0f;
        k1();
        this.f36328k1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f36328k1.setOnItemClickListener(new hl0(this, i7, f2Var, 1));
        ui.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        jz jzVar = new jz(getContext());
        this.f56451g2 = jzVar;
        this.f28618c.addView(jzVar, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.E2 = frameLayout;
        this.f28615b.addView(frameLayout, ha.e(-1, 140, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
