package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import fi.q5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.nm0;
public final class x0 extends nm0 {
    public final ArrayList f48599f3;
    public final ArrayList f48600g3;
    public final ArrayList f48601h3;
    public final ArrayList f48602i3;
    public final ArrayList f48603j3;
    public final q5 f48604k3;

    public x0(q5 q5Var, Context context, e1 e1Var) {
        super(context, e1Var);
        this.f48604k3 = q5Var;
        this.f48599f3 = new ArrayList();
        this.f48600g3 = new ArrayList();
        this.f48601h3 = new ArrayList();
        this.f48602i3 = new ArrayList();
        this.f48603j3 = new ArrayList(10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        float f10;
        boolean z10;
        float f11;
        float f12;
        boolean z11;
        float f13;
        float f14;
        float f15;
        int i12;
        boolean z12;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i13;
        canvas.save();
        this.E1.setEmpty();
        int childCount = getChildCount();
        int i14 = 0;
        MessageObject.GroupedMessages groupedMessages = null;
        while (true) {
            f7 = 0.0f;
            i10 = 4;
            i11 = 2;
            f10 = 2.0f;
            z10 = true;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                        jb0 backgroundDrawable = s1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f29617f || s1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y3 = (int) s1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i13 = s1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = s1Var.getMeasuredHeight() + y3;
                                long j10 = 0;
                                float f16 = 0.0f;
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt2 = getChildAt(i15);
                                    if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                        if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            jb0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                            int min = Math.min(y3, (int) s1Var2.getY());
                                            int max = Math.max(measuredHeight, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                            long j11 = backgroundDrawable2.f29622l;
                                            if (j11 > j10) {
                                                float x9 = s1Var2.getX() + backgroundDrawable2.h;
                                                f16 = s1Var2.getY() + backgroundDrawable2.f29619i;
                                                f7 = x9;
                                                j10 = j11;
                                            }
                                            y3 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.f29620j = f7;
                                backgroundDrawable.f29621k = f16 - y3;
                                i13 = measuredHeight - y3;
                            }
                            int i16 = i13 + y3;
                            canvas.clipRect(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.f29615b = null;
                            backgroundDrawable.f29614a.setColor(y6.w0(y6.Hc, this.f30988n2));
                            backgroundDrawable.setBounds(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.J()) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                        canvas.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                        v0Var.y(canvas, true);
                        v0Var.B(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i14++;
        }
        int i17 = 0;
        while (i17 < 3) {
            ArrayList arrayList = this.f48603j3;
            arrayList.clear();
            if (i17 == i11 && !this.V1) {
                i12 = i11;
            } else {
                int i18 = 0;
                while (i18 < childCount) {
                    View childAt3 = getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && s1Var3.getVisibility() != i10 && s1Var3.getVisibility() != 8 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null && ((i17 != 0 || currentMessagesGroup.messages.size() != z10) && ((i17 != z10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i17 != 0 || !s1Var3.getMessageObject().deleted) && ((i17 != z10 || s1Var3.getMessageObject().deleted) && ((i17 != i11 || s1Var3.f25227oc) && (i17 == i11 || !s1Var3.f25227oc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = 0;
                                transitionParams.top = 0;
                                transitionParams.right = 0;
                                transitionParams.bottom = 0;
                                transitionParams.pinnedBotton = false;
                                transitionParams.pinnedTop = false;
                                transitionParams.cell = s1Var3;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = s1Var3.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.m3();
                            int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                            int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                            int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                            int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                            if ((s1Var3.getCurrentPosition().flags & i10) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i19 = backgroundDrawableTop;
                            if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i20 = backgroundDrawableBottom;
                            if (s1Var3.f25227oc) {
                                currentMessagesGroup.transitionParams.cell = s1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i21 = transitionParams2.top;
                            if (i21 == 0 || i19 < i21) {
                                transitionParams2.top = i19;
                            }
                            int i22 = transitionParams2.bottom;
                            if (i22 == 0 || i20 > i22) {
                                transitionParams2.bottom = i20;
                            }
                            int i23 = transitionParams2.left;
                            if (i23 == 0 || backgroundDrawableLeft < i23) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i24 = transitionParams2.right;
                            if (i24 == 0 || backgroundDrawableRight > i24) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                            i18++;
                            i11 = 2;
                            f7 = 0.0f;
                        }
                    }
                    i18++;
                    i11 = 2;
                    f7 = 0.0f;
                }
                int i25 = 0;
                while (i25 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i25);
                    float E2 = groupedMessages2.transitionParams.cell.E2(z10);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f17 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f18 = transitionParams3.top + transitionParams3.offsetTop;
                    float f19 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f20 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f18 += transitionParams3.cell.getTranslationY();
                        f20 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f21 = f18;
                    float f22 = f20;
                    if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (z12) {
                        canvas.save();
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), c3.h0.B(f19, f17, f10, f17), c3.h0.B(f22, f21, f10, f21));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    float f23 = f10;
                    transitionParams4.cell.B1(canvas, (int) f17, (int) f21, (int) f19, (int) f22, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z12) {
                        canvas.restore();
                        for (int i26 = 0; i26 < childCount; i26++) {
                            View childAt4 = getChildAt(i26);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top = s1Var4.getTop();
                                    childAt4.setPivotX(((f19 - f17) / f23) + (f17 - left));
                                    childAt4.setPivotY(((f22 - f21) / f23) + (f21 - top));
                                }
                            }
                        }
                    }
                    i25++;
                    z10 = true;
                    f10 = f23;
                    arrayList = arrayList2;
                }
                i12 = 2;
            }
            i17++;
            z10 = z10;
            i11 = i12;
            f10 = f10;
            f7 = 0.0f;
            i10 = 4;
        }
        boolean z13 = z10;
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.f48599f3;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i27 = 0; i27 < size; i27++) {
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList3.get(i27);
                canvas.save();
                canvas.translate(s1Var5.E2(false) + s1Var5.getLeft(), s1Var5.getY());
                if (s1Var5.a()) {
                    f15 = s1Var5.getAlpha();
                } else {
                    f15 = 1.0f;
                }
                s1Var5.m2(f15, canvas, z13);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f48600g3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i28 = 0; i28 < size2; i28++) {
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) arrayList4.get(i28);
                float E22 = s1Var6.E2(false) + s1Var6.getLeft();
                float y10 = s1Var6.getY();
                if (s1Var6.a()) {
                    f14 = s1Var6.getAlpha();
                } else {
                    f14 = 1.0f;
                }
                canvas.save();
                canvas.translate(E22, y10);
                s1Var6.setInvalidatesParent(z13);
                s1Var6.W1(canvas, f14);
                s1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f48601h3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i29 = 0;
            while (i29 < size3) {
                org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList5.get(i29);
                if (s1Var7.getCurrentPosition() != null && (s1Var7.getCurrentPosition().flags & z13) == 0) {
                    z11 = z13;
                } else {
                    z11 = false;
                }
                if (s1Var7.a()) {
                    f13 = s1Var7.getAlpha();
                } else {
                    f13 = 1.0f;
                }
                float E23 = s1Var7.E2(false) + s1Var7.getLeft();
                float y11 = s1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = s1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float E24 = s1Var7.E2(z13);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f24 = transitionParams6.left + E24 + transitionParams6.offsetLeft;
                    float f25 = transitionParams6.top + transitionParams6.offsetTop;
                    float f26 = transitionParams6.right + E24 + transitionParams6.offsetRight;
                    float f27 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        f25 += s1Var7.getTranslationY();
                        f27 += s1Var7.getTranslationY();
                    }
                    canvas.clipRect(f24 + AndroidUtilities.dp(8.0f), f25 + AndroidUtilities.dp(8.0f), f26 - AndroidUtilities.dp(8.0f), f27 - AndroidUtilities.dp(8.0f));
                }
                if (s1Var7.getTransitionParams().f24939v0) {
                    canvas.translate(E23, y11);
                    s1Var7.setInvalidatesParent(true);
                    s1Var7.I1(f13, canvas, z11);
                    s1Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
                i29++;
                z13 = true;
            }
            f11 = 8.0f;
            arrayList5.clear();
        } else {
            f11 = 8.0f;
        }
        ArrayList arrayList6 = this.f48602i3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i30 = 0; i30 < size4; i30++) {
                org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList6.get(i30);
                if (s1Var8.getCurrentPosition() == null || (s1Var8.getCurrentPosition().flags & 1) != 0) {
                    if (s1Var8.a()) {
                        f12 = s1Var8.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float E25 = s1Var8.E2(false) + s1Var8.getLeft();
                    float y12 = s1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = s1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float E26 = s1Var8.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f28 = transitionParams7.left + E26 + transitionParams7.offsetLeft;
                        float f29 = transitionParams7.top + transitionParams7.offsetTop;
                        float f30 = transitionParams7.right + E26 + transitionParams7.offsetRight;
                        float f31 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            f29 += s1Var8.getTranslationY();
                            f31 += s1Var8.getTranslationY();
                        }
                        canvas.clipRect(f28 + AndroidUtilities.dp(f11), f29 + AndroidUtilities.dp(f11), f30 - AndroidUtilities.dp(f11), f31 - AndroidUtilities.dp(f11));
                    }
                    if (s1Var8.getTransitionParams().f24939v0) {
                        canvas.translate(E25, y12);
                        s1Var8.setInvalidatesParent(true);
                        s1Var8.d2(canvas, f12, null);
                        s1Var8.N1(canvas, f12);
                        s1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: sg.x0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }
}
