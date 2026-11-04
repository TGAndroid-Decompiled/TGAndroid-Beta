package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class zw extends org.telegram.ui.Components.sj0 {
    public final Context f52758c;
    public Drawable d;
    public Drawable f52759e;
    public final cx f52760f;

    public zw(cx cxVar, Context context) {
        this.f52760f = cxVar;
        this.f52758c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 1 || i3 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f52760f.f44463w;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        cx cxVar = this.f52760f;
        if (i3 == cxVar.h) {
            return 1;
        }
        if (i3 == cxVar.f44462s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = true;
        cx cxVar = this.f52760f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    Long l10 = (Long) cxVar.f44458e.get(i3 - cxVar.f44460n);
                    long longValue = l10.longValue();
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a22 = cxVar.getMessagesController().a2(l10);
                        if (i3 == cxVar.f44461r - 1) {
                            z10 = false;
                        }
                        h4Var.e(a22, null, null, z10);
                        return;
                    }
                    TLRPC.Chat M0 = cxVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i3 == cxVar.f44461r - 1) {
                        z10 = false;
                    }
                    h4Var.e(M0, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.g(-1, org.telegram.ui.ActionBar.k6.f28121q6);
            if (this.d == null) {
                Context context = this.f52758c;
                this.d = context.getResources().getDrawable(2131232557);
                this.f52759e = context.getResources().getDrawable(2131232558);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.f52759e;
            int i11 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(l8Var, drawable, i11, null, mode);
            org.telegram.ui.ActionBar.r6.y(l8Var, drawable2, org.telegram.ui.ActionBar.k6.f28008k7, null, mode);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            String M02 = org.telegram.messenger.bd.M0(2131745678, null);
            if (cxVar.f44460n == -1) {
                z10 = false;
            }
            l8Var.p(M02, xpVar, z10);
            l8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i3 == cxVar.f44462s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = cxVar.f44464x;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131751213, null));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131751212, null));
            }
            if (org.telegram.messenger.az.f21661s.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131742881, null)));
            }
            y8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        bx bxVar;
        int i10;
        Context context = this.f52758c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
                    ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231627);
                    e10.setScaleType(ImageView.ScaleType.CENTER);
                    h4Var.setTag(2131296585, e10);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    h4Var.addView(e10, b8.mf.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    e10.setOnTouchListener(new gi.n1(5, this, h4Var));
                    org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f27845b9, null, PorterDuff.Mode.MULTIPLY);
                    bxVar = h4Var;
                } else {
                    cx cxVar = this.f52760f;
                    bx bxVar2 = new bx(cxVar, context);
                    cxVar.f44459f = bxVar2;
                    bxVar = bxVar2;
                }
            } else {
                FrameLayout l8Var = new org.telegram.ui.Cells.l8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var, null);
                bxVar = l8Var;
            }
        } else {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
            bxVar = y8Var;
        }
        return new u4.d1(bxVar);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, d1Var.f55540a, null);
    }
}
