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
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.e61;
import org.telegram.ui.ls0;
import org.telegram.ui.ys0;
public class f1 extends ma implements ls {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public w70[] J2;
    public w70 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final j V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final ls0 Y1;
    public int Z1;
    public int f56574a2;
    public int f56575b2;
    public int f56576c2;
    public int d2;
    public int f56577e2;
    public int f56578f2;
    public int f56579g2;
    public int f56580h2;
    public int f56581i2;
    public final jz f56582j2;
    public final y0 f56583k2;
    public hi.e f56584l2;
    public qd f56585m2;
    public e61 f56586n2;
    public final f2 f56587o2;
    public Integer f56588p2;
    public float f56589q2;
    public float f56590r2;
    public float f56591s2;
    public float f56592t2;
    public float f56593u2;
    public View f56594v2;
    public View f56595w2;
    public TLRPC.InputStickerSet f56596x2;
    public TLRPC.TL_emojiStatusCollectible f56597y2;
    public boolean f56598z2;

    public f1(f2 f2Var, int i7, TLRPC.User user, h6 h6Var) {
        this(f2Var, i7, user, null, null, h6Var);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new k5(this, 11);
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131744231, null);
    }

    @Override
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i11 < arrayList.size()) {
                ls0 ls0Var = this.Y1;
                ls0Var.a((ys0) arrayList.get(i11), false);
                ls0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ys0) arrayList.get(i11)).f52112e = i12;
                i12 += ls0Var.getMeasuredHeight();
                i11++;
            } else {
                this.Z1 = i12;
                this.f28675c.getLocationOnScreen(this.A2);
                return;
            }
        }
    }

    @Override
    public final void U0(st0 st0Var) {
        this.T1 = p10.f24474s0;
        p0 p0Var = new p0(getContext(), this.I0, false);
        p0Var.b(PremiumPreviewFragment.t0(this.T1, null), new ii.g(this, 26), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        t6.h(m6.f27891d7, view, this.I0);
        this.G2.addView(view, ha.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (!p10.i(this.T1).q() && !(this instanceof wg.j0)) {
            this.G2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            t6.h(m6.f27963h5, this.G2, this.I0);
            st0Var.addView(this.G2, ha.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f56595w2;
        if (view2 != null) {
            if (this.C2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f56594v2 != null && this.C2) {
            View view3 = this.f56595w2;
            if (view3 == null) {
                view = this.f56585m2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f56589q2, this.f56590r2};
            this.f56594v2.getMatrix().mapPoints(fArr);
            View view4 = this.f56594v2;
            if (view4 instanceof m5) {
                drawable = ((m5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.q1) {
                drawable = ((org.telegram.ui.Cells.q1) view4).f29983pa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.A2;
            float f10 = (-iArr[0]) + this.f56591s2 + fArr[0];
            float f11 = (-iArr[1]) + this.f56592t2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f56587o2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f56593u2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f28675c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, wq.h.getInterpolation(this.B2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.B2);
            float f14 = this.f56593u2;
            float f15 = this.B2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, i10, drawable), org.telegram.ui.Cells.f1.y(2, i11, drawable), org.telegram.ui.Cells.f1.w(2, i10, drawable), org.telegram.ui.Cells.f1.f(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.B2);
            canvas.scale(T13, T13, T1, T12);
            canvas.translate(T1 - (view.getMeasuredWidth() / 2.0f), T12 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == qs.B0 && (inputStickerSet = this.f56596x2) != null && inputStickerSet.f26980id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        qs.e().k(qs.f25030k1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        jz jzVar = this.f56582j2;
        if (jzVar.f35113c) {
            jzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(e61 e61Var) {
        e61Var.addView(this.f56595w2, ha.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.f56588p2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, m6.f28206u6, this.I0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z9) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        w70[] w70VarArr = this.J2;
        if (w70VarArr != null && this.K2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f56597y2;
            TLRPC.User user = this.U1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.J2[0].setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131744219, org.telegram.messenger.m5.u(user), str2), new a1(this, 0)));
                this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744217, null)));
            } else if (this.f56596x2 != null) {
                CharSequence i12 = i1(id.a0(null, null, 2131744216, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    i12 = i6.m(i12, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (i12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) i12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(i12);
                }
                int indexOf = i12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet m0 = ui.b0(this.T1).m0(this.f56596x2, false);
                    if (m0 != null && !m0.documents.isEmpty()) {
                        document = m0.documents.get(0);
                        if (m0.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= m0.documents.size()) {
                                    break;
                                } else if (m0.documents.get(i7).f26966id == m0.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new q5(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (m0 != null && m0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) m0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new b80(org.telegram.messenger.g0.L(100.0f), this.J2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ka(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.J2[1].setOnLinkPressListener(new v70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            f1 f1Var = f1.this;
                            arrayList.add(f1Var.f56596x2);
                            w4 w4Var = new w4(f1Var, 11);
                            f2 f2Var = f1Var.f56587o2;
                            if (f2Var != null) {
                                w4Var.setParentFragment(f2Var);
                            }
                            new d1(f1Var, w4Var, f1Var.getContext(), f1Var.I0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        w70[] w70VarArr2 = this.J2;
                        if (w70VarArr2 != null) {
                            w70VarArr2[1].setText(spannableStringBuilder);
                            if (this.J2[1].getVisibility() != 0) {
                                if (z9) {
                                    this.J2[1].setAlpha(0.0f);
                                    this.J2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                                    wq wqVar = wq.f40046f;
                                    org.telegram.messenger.camera.q.l(alpha, wqVar, 200L);
                                    this.J2[0].animate().alpha(0.0f).setInterpolator(wqVar).setDuration(200L).withEndAction(new a1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new c1(this, 1));
                                    ofFloat.setInterpolator(wqVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.J2[1].setAlpha(1.0f);
                                    this.J2[1].setVisibility(0);
                                    this.J2[0].setAlpha(0.0f);
                                    this.J2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.J2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744217, null)));
            } else if (this.f56598z2) {
                w70VarArr[0].setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744218, g5.m(0, user.first_name, user.last_name))));
                this.K2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744217, g5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.V1;
                if (jVar != null) {
                    if (this.X1) {
                        w70 w70Var = w70VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        w70Var.setText(i1(id.a0(null, null, 2131744220, str, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                        w70 w70Var2 = this.K2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        w70Var2.setText(i1(id.a0(null, null, 2131744221, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f27109id != 777000) {
                        this.J2[0].setText(i1(id.a0(null, null, 2131744223, user.first_name, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744224, null)));
                    } else {
                        this.J2[0].setText(i1(id.a0(null, null, 2131744222, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744224, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.W1;
                    if (starGift != null) {
                        w70VarArr[0].setText(id.M0(2131750068, null));
                        this.J2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.K2.setText(org.telegram.messenger.g0.X2(id.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131750072, null)));
                        }
                        this.K2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        w70VarArr[0].setText(id.M0(2131744231, null));
                        this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744229, null)));
                    } else {
                        w70VarArr[0].setText(i1(id.a0(null, null, 2131744225, g5.m(0, user.first_name, user.last_name))));
                        this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744226, null)));
                    }
                }
            }
            try {
                w70 w70Var3 = this.J2[0];
                w70Var3.setText(i6.m(w70Var3.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void k1() {
        int i7 = this.f56574a2;
        int i10 = i7 + 1;
        this.f56574a2 = i10;
        this.f56575b2 = i7;
        this.f56577e2 = i10;
        int size = this.S1.size() + i10;
        this.f56578f2 = size;
        this.f56574a2 = size + 1;
        this.f56579g2 = size;
        if (!p10.i(this.T1).q() && this.V1 == null) {
            int i11 = this.f56574a2;
            this.f56574a2 = i11 + 1;
            this.f56580h2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f56594v2 == null) {
            return false;
        }
        this.D2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B2 = 0.0f;
        this.C2 = true;
        this.f56586n2.invalidate();
        View view = this.f56594v2;
        if (view instanceof m5) {
            drawable = ((m5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            f5 f5Var = q1Var.f29983pa;
            q1Var.p2();
            drawable = f5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f56594v2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        qd qdVar = this.f56585m2;
        if (qdVar != null) {
            qdVar.m(100L);
        }
        this.D2.addUpdateListener(new c1(this, 0));
        this.D2.addListener(new v50(23, this, drawable));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(wq.h);
        this.D2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(p10.f24474s0).c(this, qs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(p10.f24474s0).n(this, qs.B0);
    }

    @Override
    public final void show() {
        super.show();
        qs.e().k(qs.f25025j1, 4);
        if (this.E2) {
            org.telegram.messenger.g0.i3(new a1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        qd qdVar = this.f56585m2;
        if (qdVar != null) {
            qdVar.setDialogVisible(true);
        }
        this.f56584l2.setPaused(true);
        dialog.setOnDismissListener(new eb(this, 14));
        dialog.show();
        return true;
    }

    public f1(f2 f2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, h6 h6Var) {
        super(f2Var, false, false, h6Var);
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        N();
        this.f56587o2 = f2Var;
        this.f35908u1 = 0.26f;
        this.U1 = user;
        this.T1 = i7;
        this.V1 = jVar;
        this.W1 = starGift;
        this.Y1 = new ls0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || p10.i(i7).q()) {
            this.G2.setVisibility(8);
        }
        y0 y0Var = new y0(m6.zk, m6.Ak, m6.Bk, m6.Ck, null);
        this.f56583k2 = y0Var;
        y0Var.f56883m = true;
        y0Var.f56885o = 1.0f;
        y0Var.f56886p = 0.0f;
        y0Var.f56887q = 0.0f;
        y0Var.f56874b = 0.0f;
        y0Var.f56875c = 0.0f;
        k1();
        this.n1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.n1.setOnItemClickListener(new hl0(this, i7, f2Var, 1));
        ui.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        jz jzVar = new jz(getContext());
        this.f56582j2 = jzVar;
        this.f28675c.addView(jzVar, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.f28672b.addView(frameLayout, ha.e(-1, 140, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
