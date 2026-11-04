package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class y7 extends u4.h0 {
    public final int f52217c;
    public final Object d;

    public y7(Object obj, int i3) {
        this.f52217c = i3;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i3, boolean z10) {
        int i10;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p10;
        org.telegram.messenger.xi xiVar;
        int lineTop2;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.hb;
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f26915w2 != null) {
                    q1Var.R2(true);
                    org.telegram.messenger.cv cvVar = messageObject.f26915w2;
                    ArrayList arrayList2 = cvVar.f22076n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) cvVar.f22077o.get(size)).intValue();
                        if (i3 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i3 - intValue, a10.getText().length()));
                                int y9 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).getY() + q1Var.f30094u0;
                                if (z10) {
                                    lineTop2 = a10.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = a10.getLineTop(lineForOffset);
                                }
                                return y9 + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (!TextUtils.isEmpty(messageObject.f26924z) && (xiVar = q1Var.f29985l3) != null) {
                        i10 = (int) q1Var.f30073s3;
                        charSequence = messageObject.f26924z;
                        arrayList = xiVar.f26387e;
                    } else {
                        q1Var.R2(true);
                        int i11 = q1Var.f30094u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.f26927z2;
                        if (q1Var.f30095u1) {
                            i10 = org.telegram.messenger.k5.C(10.0f, q1Var.V1, i11);
                        } else {
                            i10 = i11;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i12);
                            StaticLayout staticLayout = wiVar.f26210e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = wiVar.f26212n;
                            if (i3 > i13) {
                                if (i3 - i13 > charSequence3.length() - 1) {
                                    p10 = i10 + ((int) (wiVar.p(arrayList, x1Var) + wiVar.f26211f + wiVar.f26215w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i3 - wiVar.f26212n);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p10 = lineTop + wiVar.p(arrayList, x1Var) + i10 + wiVar.f26211f;
                                }
                                return (int) p10;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int b() {
        switch (this.f52217c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f30366f3.size();
            case 2:
                return ((org.telegram.ui.Components.o8) this.d).f36775f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.bj bjVar = ((org.telegram.ui.Components.x90) this.d).f40295r;
                if (bjVar == null) {
                    return 0;
                }
                return bjVar.f21842f.size();
            default:
                return ((bm0) this.d).f44075f.size();
        }
    }

    @Override
    public long c(int i3) {
        switch (this.f52217c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i3 / 12)) * 100) + (i8Var.K - (i3 % 12));
            case 1:
            default:
                return super.c(i3);
            case 2:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.d;
                if (i3 >= o8Var.f36775f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.n8) o8Var.f36775f3.get(i3)).f36411a;
        }
    }

    @Override
    public int d(int i3) {
        switch (this.f52217c) {
            case 2:
                if (i3 >= ((org.telegram.ui.Components.o8) this.d).f36775f3.size()) {
                    return 1;
                }
                return 0;
            case 5:
                return 0;
            default:
                return super.d(i3);
        }
    }

    @Override
    public final void t(u4.d1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.f52217c) {
            case 0:
                return new u4.d1(new f8((i8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f30302a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f30303b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f30304c = qVar;
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(qVar, b8.mf.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                linearLayout.addView(textView, b8.mf.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new u4.d1(linearLayout);
            case 2:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.d;
                return new u4.d1(new org.telegram.ui.Components.p8(o8Var.f36779k3, o8Var.getContext()));
            case 3:
                return new u4.d1(((org.telegram.ui.Components.am) this.d).f31898w);
            case 4:
                return new u4.d1(new ai.x2(17, ((org.telegram.ui.Components.bn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.d;
                org.telegram.ui.Components.da0 da0Var = x90Var.f40291d0;
                org.telegram.ui.Components.v90 v90Var = new org.telegram.ui.Components.v90(this, context2, da0Var.f33042x, x90Var.K, da0Var.G);
                v90Var.setClipChildren(false);
                v90Var.setClipToPadding(false);
                v90Var.setDelegate(new org.telegram.ui.Components.w90(this));
                return new u4.d1(v90Var);
            default:
                org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(viewGroup.getContext(), null);
                s70Var.setGravity(17);
                s70Var.setTypeface(org.telegram.messenger.g0.o());
                s70Var.setTextSize(1, 14.0f);
                s70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                s70Var.setEllipsize(TextUtils.TruncateAt.END);
                s70Var.setSingleLine();
                s70Var.setMaxLines(1);
                s70Var.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(28.0f)));
                b8.pf.b(s70Var, 0.075f, 1.4f);
                return new u4.d1(s70Var);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        int i3;
        boolean z10;
        boolean z11;
        int i10;
        int[] f10;
        switch (this.f52217c) {
            case 5:
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.d;
                org.telegram.ui.Components.r90 r90Var = x90Var.f40292e;
                org.telegram.ui.Components.da0 da0Var = x90Var.f40291d0;
                if (x90Var.f40295r != null && (i3 = x90Var.f40285a) != 1) {
                    View view = d1Var.f55540a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i3 == 0) {
                            org.telegram.messenger.ui a10 = org.telegram.ui.Components.x90.a(x90Var, q1Var.getMessageObject());
                            if (a10 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q1Var.setDrawSelectionBackground(z10);
                            if (a10 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            q1Var.j3(true, z11, false);
                            org.telegram.messenger.dj djVar = da0Var.d;
                            if (!djVar.f22203i && djVar.d != null && x90Var.e(q1Var)) {
                                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.dj djVar2 = da0Var.d;
                                org.telegram.messenger.dj djVar3 = da0Var.d;
                                mm mmVar = djVar3.d;
                                if (mmVar.f47710m && messageObject != null && messageObject.f26915w2 != null && ((i10 = djVar3.f22200e) < 0 || djVar3.f22201f <= i10)) {
                                    String str = mmVar.f47706i;
                                    if (str == null) {
                                        f10 = null;
                                    } else {
                                        f10 = org.telegram.messenger.gv.f(messageObject, str, mmVar.f47712o);
                                    }
                                    if (f10 != null) {
                                        djVar2.f22200e = f10[0];
                                        djVar2.f22201f = f10[1];
                                    } else {
                                        djVar2.f22200e = 0;
                                        djVar2.f22201f = Math.min(org.telegram.messenger.hp.s1(da0Var.f33042x).f23081o4, mm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.dj djVar4 = da0Var.d;
                            if (!djVar4.f22203i && djVar4.d != null && djVar4.f22200e >= 0 && x90Var.e(q1Var) && !r90Var.x()) {
                                org.telegram.messenger.dj djVar5 = da0Var.d;
                                r90Var.a0(q1Var, djVar5.f22200e, djVar5.f22201f);
                                if (x90Var.f40290c0) {
                                    x90Var.M = D(q1Var, da0Var.d.f22200e, false);
                                    x90Var.N = D(q1Var, da0Var.d.f22201f, true);
                                    x90Var.O = true;
                                    x90Var.f40290c0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        q1Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(u4.d1 d1Var, int i3) {
    }

    private final void F(u4.d1 d1Var, int i3) {
    }
}
