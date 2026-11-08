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
public final class x7 extends v4.g0 {
    public final int f51793c;
    public final Object d;

    public x7(Object obj, int i7) {
        this.f51793c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9) {
        int i10;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p10;
        org.telegram.messenger.gj gjVar;
        int lineTop2;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.f29872hb;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f23309w2 != null) {
                    q1Var.S2(true);
                    org.telegram.messenger.kv kvVar = messageObject.f23309w2;
                    ArrayList arrayList2 = kvVar.f23774n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) kvVar.f23775o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.t9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                int y10 = ((org.telegram.ui.Cells.t9) arrayList2.get(size)).getY() + q1Var.f30010t0;
                                if (z9) {
                                    lineTop2 = a10.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = a10.getLineTop(lineForOffset);
                                }
                                return y10 + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (!TextUtils.isEmpty(messageObject.f23318z) && (gjVar = q1Var.f29913l3) != null) {
                        i10 = (int) q1Var.f30002s3;
                        charSequence = messageObject.f23318z;
                        arrayList = gjVar.f22680e;
                    } else {
                        q1Var.S2(true);
                        int i11 = q1Var.f30010t0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.f23321z2;
                        if (q1Var.f30023u1) {
                            i10 = org.telegram.messenger.k5.C(10.0f, q1Var.V1, i11);
                        } else {
                            i10 = i11;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i12);
                            StaticLayout staticLayout = fjVar.f22424e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = fjVar.f22426n;
                            if (i7 > i13) {
                                if (i7 - i13 > charSequence3.length() - 1) {
                                    p10 = i10 + ((int) (fjVar.p(arrayList, x1Var) + fjVar.f22425f + fjVar.f22429w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - fjVar.f22426n);
                                    if (z9) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p10 = lineTop + fjVar.p(arrayList, x1Var) + i10 + fjVar.f22425f;
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
        switch (this.f51793c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f30292e3.size();
            case 2:
                return ((org.telegram.ui.Components.q8) this.d).f37219e3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.kj kjVar = ((org.telegram.ui.Components.ca0) this.d).f32529r;
                if (kjVar == null) {
                    return 0;
                }
                return kjVar.f23701f.size();
            default:
                return ((gm0) this.d).f46034f.size();
        }
    }

    @Override
    public long c(int i7) {
        switch (this.f51793c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i7 / 12)) * 100) + (h8Var.J - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.d;
                if (i7 >= q8Var.f37219e3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.p8) q8Var.f37219e3.get(i7)).f36837a;
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f51793c) {
            case 2:
                if (i7 >= ((org.telegram.ui.Components.q8) this.d).f37219e3.size()) {
                    return 1;
                }
                return 0;
            case 5:
                return 0;
            default:
                return super.d(i7);
        }
    }

    @Override
    public final void t(v4.d1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x7.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.f51793c) {
            case 0:
                return new v4.d1(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f30229a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f30230b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f30231c = qVar;
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(qVar, c8.ha.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                linearLayout.addView(textView, c8.ha.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new v4.d1(linearLayout);
            case 2:
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.d;
                return new v4.d1(new org.telegram.ui.Components.r8(q8Var.j3, q8Var.getContext()));
            case 3:
                return new v4.d1(((org.telegram.ui.Components.bm) this.d).f32222w);
            case 4:
                return new v4.d1(new bi.ec(16, ((org.telegram.ui.Components.cn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) this.d;
                org.telegram.ui.Components.ia0 ia0Var = ca0Var.f32525c0;
                org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(this, context2, ia0Var.f34621x, ca0Var.J, ia0Var.F);
                aa0Var.setClipChildren(false);
                aa0Var.setClipToPadding(false);
                aa0Var.setDelegate(new org.telegram.ui.Components.ba0(this));
                return new v4.d1(aa0Var);
            default:
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(viewGroup.getContext(), null);
                w70Var.setGravity(17);
                w70Var.setTypeface(org.telegram.messenger.g0.o());
                w70Var.setTextSize(1, 14.0f);
                w70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                w70Var.setEllipsize(TextUtils.TruncateAt.END);
                w70Var.setSingleLine();
                w70Var.setMaxLines(1);
                w70Var.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.ka.b(w70Var, 0.075f, 1.4f);
                return new v4.d1(w70Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        int i7;
        boolean z9;
        boolean z10;
        int i10;
        int[] f10;
        switch (this.f51793c) {
            case 5:
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) this.d;
                org.telegram.ui.Components.w90 w90Var = ca0Var.f32526e;
                org.telegram.ui.Components.ia0 ia0Var = ca0Var.f32525c0;
                if (ca0Var.f32529r != null && (i7 = ca0Var.f32520a) != 1) {
                    View view = d1Var.f57044a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i7 == 0) {
                            org.telegram.messenger.dj a10 = org.telegram.ui.Components.ca0.a(ca0Var, q1Var.getMessageObject());
                            if (a10 == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            q1Var.setDrawSelectionBackground(z9);
                            if (a10 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q1Var.l3(true, z10, false);
                            org.telegram.messenger.mj mjVar = ia0Var.d;
                            if (!mjVar.f24036i && mjVar.d != null && ca0Var.e(q1Var)) {
                                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.mj mjVar2 = ia0Var.d;
                                org.telegram.messenger.mj mjVar3 = ia0Var.d;
                                qm qmVar = mjVar3.d;
                                if (qmVar.f49275m && messageObject != null && messageObject.f23309w2 != null && ((i10 = mjVar3.f24033e) < 0 || mjVar3.f24034f <= i10)) {
                                    String str = qmVar.f49271i;
                                    if (str == null) {
                                        f10 = null;
                                    } else {
                                        f10 = org.telegram.messenger.ov.f(messageObject, str, qmVar.f49277o);
                                    }
                                    if (f10 != null) {
                                        mjVar2.f24033e = f10[0];
                                        mjVar2.f24034f = f10[1];
                                    } else {
                                        mjVar2.f24033e = 0;
                                        mjVar2.f24034f = Math.min(org.telegram.messenger.qp.s1(ia0Var.f34621x).o4, qm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.mj mjVar4 = ia0Var.d;
                            if (!mjVar4.f24036i && mjVar4.d != null && mjVar4.f24033e >= 0 && ca0Var.e(q1Var) && !w90Var.x()) {
                                org.telegram.messenger.mj mjVar5 = ia0Var.d;
                                w90Var.a0(q1Var, mjVar5.f24033e, mjVar5.f24034f);
                                if (ca0Var.f32523b0) {
                                    ca0Var.L = D(q1Var, ia0Var.d.f24033e, false);
                                    ca0Var.M = D(q1Var, ia0Var.d.f24034f, true);
                                    ca0Var.N = true;
                                    ca0Var.f32523b0 = false;
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

    private final void E(v4.d1 d1Var, int i7) {
    }

    private final void F(v4.d1 d1Var, int i7) {
    }
}
