package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.zk0;

public final class x0 extends zk0 {
    public final ArrayList T2;
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final r5 Y2;

    public x0(r5 r5Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar);
        this.Y2 = r5Var;
        this.T2 = new ArrayList();
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList(10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        float f11;
        boolean z10;
        float f12;
        MessageObject.GroupedMessages currentMessagesGroup;
        int measuredHeight;
        canvas.save();
        this.C1.setEmpty();
        int childCount = getChildCount();
        int i12 = 0;
        MessageObject.GroupedMessages groupedMessages = null;
        while (true) {
            f10 = 0.0f;
            i10 = 4;
            i11 = 2;
            f11 = 2.0f;
            z10 = true;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                        ca0 backgroundDrawable = s1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f27395f || s1Var.f3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y10 = (int) s1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                measuredHeight = s1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight2 = s1Var.getMeasuredHeight() + y10;
                                long j10 = 0;
                                float y11 = 0.0f;
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = getChildAt(i13);
                                    if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                        if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            ca0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                            int iMin = Math.min(y10, (int) s1Var2.getY());
                                            int iMax = Math.max(measuredHeight2, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                            long j11 = backgroundDrawable2.f27400l;
                                            if (j11 > j10) {
                                                float x8 = s1Var2.getX() + backgroundDrawable2.h;
                                                y11 = s1Var2.getY() + backgroundDrawable2.f27397i;
                                                f10 = x8;
                                                j10 = j11;
                                            }
                                            y10 = iMin;
                                            measuredHeight2 = iMax;
                                        }
                                    }
                                }
                                backgroundDrawable.f27398j = f10;
                                backgroundDrawable.f27399k = y11 - y10;
                                measuredHeight = measuredHeight2 - y10;
                            }
                            int i14 = measuredHeight + y10;
                            canvas.clipRect(0, y10, getMeasuredWidth(), i14);
                            backgroundDrawable.f27392b = null;
                            backgroundDrawable.f27391a.setColor(g6.v0(g6.Hc, this.f35277l2));
                            backgroundDrawable.setBounds(0, y10, getMeasuredWidth(), i14);
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
                        v0Var.z(canvas, true);
                        v0Var.C(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i12++;
        }
        int i15 = 0;
        while (i15 < 3) {
            ArrayList arrayList = this.X2;
            arrayList.clear();
            if (i15 != i11 || this.T1) {
                int i16 = 0;
                while (i16 < childCount) {
                    View childAt3 = getChildAt(i16);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && s1Var3.getVisibility() != i10 && s1Var3.getVisibility() != 8 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null && ((i15 != 0 || currentMessagesGroup.messages.size() != z10) && ((i15 != z10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i15 != 0 || !s1Var3.getMessageObject().deleted) && ((i15 != z10 || s1Var3.getMessageObject().deleted) && ((i15 != i11 || s1Var3.kc) && (i15 == i11 || !s1Var3.kc))))))) {
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
                            currentMessagesGroup.transitionParams.pinnedTop = s1Var3.m3();
                            currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.l3();
                            int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                            int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                            int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                            int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                            if ((s1Var3.getCurrentPosition().flags & i10) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i17 = backgroundDrawableTop;
                            if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i18 = backgroundDrawableBottom;
                            if (s1Var3.kc) {
                                currentMessagesGroup.transitionParams.cell = s1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i19 = transitionParams2.top;
                            if (i19 == 0 || i17 < i19) {
                                transitionParams2.top = i17;
                            }
                            int i20 = transitionParams2.bottom;
                            if (i20 == 0 || i18 > i20) {
                                transitionParams2.bottom = i18;
                            }
                            int i21 = transitionParams2.left;
                            if (i21 == 0 || backgroundDrawableLeft < i21) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i22 = transitionParams2.right;
                            if (i22 == 0 || backgroundDrawableRight > i22) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                        }
                    }
                    i16++;
                    i11 = 2;
                    f10 = 0.0f;
                }
                int i23 = 0;
                while (i23 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i23);
                    float fD2 = groupedMessages2.transitionParams.cell.D2(z10);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f13 = transitionParams3.left + fD2 + transitionParams3.offsetLeft;
                    float translationY = transitionParams3.top + transitionParams3.offsetTop;
                    float f14 = transitionParams3.offsetRight + transitionParams3.right + fD2;
                    float translationY2 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        translationY += transitionParams3.cell.getTranslationY();
                        translationY2 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f15 = translationY;
                    float f16 = translationY2;
                    boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                    if (z11) {
                        canvas.save();
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f14, f13, f11, f13), com.google.android.recaptcha.internal.a.A(f16, f15, f11, f15));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    transitionParams4.cell.A1(canvas, (int) f13, (int) f15, (int) f14, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i24 = 0; i24 < childCount; i24++) {
                            View childAt4 = getChildAt(i24);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top = s1Var4.getTop();
                                    childAt4.setPivotX(((f14 - f13) / 2.0f) + (f13 - left));
                                    childAt4.setPivotY(((f16 - f15) / 2.0f) + (f15 - top));
                                }
                            }
                        }
                    }
                    i23++;
                    arrayList = arrayList2;
                    f11 = 2.0f;
                    z10 = true;
                }
            }
            i15++;
            i11 = 2;
            f11 = 2.0f;
            z10 = true;
            f10 = 0.0f;
            i10 = 4;
        }
        boolean z12 = 1;
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.T2;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i25 = 0; i25 < size; i25++) {
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList3.get(i25);
                canvas.save();
                canvas.translate(s1Var5.D2(false) + s1Var5.getLeft(), s1Var5.getY());
                s1Var5.l2(s1Var5.a() ? s1Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.U2;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i26 = 0; i26 < size2; i26++) {
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) arrayList4.get(i26);
                float fD3 = s1Var6.D2(false) + s1Var6.getLeft();
                float y12 = s1Var6.getY();
                float alpha = s1Var6.a() ? s1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(fD3, y12);
                s1Var6.setInvalidatesParent(true);
                s1Var6.V1(canvas, alpha);
                s1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.V2;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i27 = 0;
            while (i27 < size3) {
                org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList5.get(i27);
                boolean z13 = s1Var7.getCurrentPosition() != null && (s1Var7.getCurrentPosition().flags & z12) == 0;
                float alpha2 = s1Var7.a() ? s1Var7.getAlpha() : 1.0f;
                float fD4 = s1Var7.D2(false) + s1Var7.getLeft();
                float y13 = s1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = s1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float fD5 = s1Var7.D2(z12);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f17 = transitionParams6.left + fD5 + transitionParams6.offsetLeft;
                    float translationY3 = transitionParams6.top + transitionParams6.offsetTop;
                    float f18 = transitionParams6.right + fD5 + transitionParams6.offsetRight;
                    float translationY4 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        translationY3 += s1Var7.getTranslationY();
                        translationY4 += s1Var7.getTranslationY();
                    }
                    canvas.clipRect(f17 + AndroidUtilities.dp(8.0f), translationY3 + AndroidUtilities.dp(8.0f), f18 - AndroidUtilities.dp(8.0f), translationY4 - AndroidUtilities.dp(8.0f));
                }
                if (s1Var7.getTransitionParams().f25182v0) {
                    canvas.translate(fD4, y13);
                    s1Var7.setInvalidatesParent(true);
                    s1Var7.H1(alpha2, canvas, z13);
                    s1Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
                i27++;
                z12 = 1;
            }
            f12 = 8.0f;
            arrayList5.clear();
        } else {
            f12 = 8.0f;
        }
        ArrayList arrayList6 = this.W2;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i28 = 0; i28 < size4; i28++) {
                org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList6.get(i28);
                if (s1Var8.getCurrentPosition() == null || (s1Var8.getCurrentPosition().flags & 1) != 0) {
                    float alpha3 = s1Var8.a() ? s1Var8.getAlpha() : 1.0f;
                    float fD6 = s1Var8.D2(false) + s1Var8.getLeft();
                    float y14 = s1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = s1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float fD7 = s1Var8.D2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f19 = transitionParams7.left + fD7 + transitionParams7.offsetLeft;
                        float translationY5 = transitionParams7.top + transitionParams7.offsetTop;
                        float f20 = transitionParams7.right + fD7 + transitionParams7.offsetRight;
                        float translationY6 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            translationY5 += s1Var8.getTranslationY();
                            translationY6 += s1Var8.getTranslationY();
                        }
                        canvas.clipRect(f19 + AndroidUtilities.dp(f12), translationY5 + AndroidUtilities.dp(f12), f20 - AndroidUtilities.dp(f12), translationY6 - AndroidUtilities.dp(f12));
                    }
                    if (s1Var8.getTransitionParams().f25182v0) {
                        canvas.translate(fD6, y14);
                        s1Var8.setInvalidatesParent(true);
                        s1Var8.c2(canvas, alpha3, null);
                        s1Var8.M1(canvas, alpha3);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.v0 v0Var;
        float f10;
        float f11;
        int i10;
        int iB;
        int iB2;
        int i11;
        r5 r5Var = this.Y2;
        MessageObject.GroupedMessages groupedMessages = r5Var.f50390p0;
        org.telegram.ui.Cells.s1 s1Var = null;
        if (view instanceof org.telegram.ui.Cells.s1) {
            s1Var = (org.telegram.ui.Cells.s1) view;
            v0Var = null;
        } else {
            v0Var = view instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) view : null;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (s1Var != null && s1Var.T2()) {
            canvas.save();
            canvas.translate(s1Var.getX(), s1Var.getY() + s1Var.getPaddingTop());
            s1Var.W1(canvas);
            canvas.restore();
        } else if (v0Var != null) {
            canvas.save();
            canvas.translate(v0Var.getX(), v0Var.getY());
            v0Var.B(canvas);
            canvas.restore();
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (s1Var != null) {
            s1Var.J1(canvas);
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.restore();
        }
        if (view.getTranslationY() != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, view.getTranslationY());
        }
        if (s1Var != null) {
            s1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
            if (currentPosition != null || s1Var.getTransitionParams().f25186w0) {
                if (currentPosition == null || currentPosition.last || (currentPosition.minX == 0 && currentPosition.minY == 0)) {
                    if (currentPosition == null || currentPosition.last) {
                        this.T2.add(s1Var);
                    }
                    if ((currentPosition == null || (currentPosition.minX == 0 && currentPosition.minY == 0)) && s1Var.S2()) {
                        this.U2.add(s1Var);
                    }
                }
                if (currentPosition != null || s1Var.getTransitionParams().C0 || s1Var.getTransitionParams().f25186w0) {
                    if (currentPosition == null || (currentPosition.flags & s1Var.s0()) != 0) {
                        this.V2.add(s1Var);
                    }
                    if (currentPosition != null) {
                        int i12 = currentPosition.flags;
                        if ((i12 & 8) != 0 && (i12 & 1) != 0) {
                            this.W2.add(s1Var);
                        }
                    } else {
                        this.W2.add(s1Var);
                    }
                }
            }
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage == null) {
                f10 = 0.0f;
            } else {
                boolean z10 = this.T1 || (groupedMessages != null && groupedMessages.transitionParams.backgroundChangeBounds);
                int top = z10 ? view.getTop() : (int) view.getY();
                if (!s1Var.j() || (iB2 = r5Var.f50388n0.T(view).b()) < 0) {
                    f11 = 0.0f;
                } else {
                    if (groupedMessages != null && currentPosition != null) {
                        int iIndexOf = groupedMessages.posArray.indexOf(currentPosition);
                        int size = groupedMessages.posArray.size();
                        if ((currentPosition.flags & 8) != 0) {
                            i11 = (iB2 - size) + iIndexOf;
                        } else {
                            i11 = iB2 - 1;
                            int i13 = iIndexOf + 1;
                            while (true) {
                                if (i13 < size) {
                                    f11 = 0.0f;
                                    if (groupedMessages.posArray.get(i13).minY > currentPosition.maxY) {
                                        break;
                                    }
                                    i11--;
                                    i13++;
                                }
                            }
                        }
                        f11 = 0.0f;
                        break;
                    } else {
                        f11 = 0.0f;
                        i11 = iB2 - 1;
                    }
                    if (K(i11) != null) {
                        if (view.getTranslationY() != f11) {
                            canvas.restore();
                        }
                        avatarImage.setVisible(false, false);
                        return zDrawChild;
                    }
                }
                float checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                int top2 = (int) ((z10 ? view.getTop() : view.getY()) + s1Var.getLayoutHeight() + s1Var.getTransitionParams().f25128i0);
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                boolean z11 = (s1Var.f25369i1 || s1Var.f25384j1) && checkBoxTranslation == f11;
                if (s1Var.n3() || s1Var.getTransitionParams().f25140k2) {
                    if (s1Var.getTransitionParams().f25140k2) {
                        float f12 = s1Var.getTransitionParams().K1;
                        if (!s1Var.n3()) {
                            f12 = 1.0f - f12;
                        }
                        top2 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, Math.min(top2, measuredHeight), top2 * f12);
                    }
                } else if (top2 > measuredHeight) {
                    top2 = measuredHeight;
                }
                if (!z10 && view.getTranslationY() != f11) {
                    canvas.restore();
                }
                if (s1Var.h() && (iB = T(view).b()) >= 0) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < 20) {
                            i14++;
                            if (groupedMessages != null && currentPosition != null) {
                                int iIndexOf2 = groupedMessages.posArray.indexOf(currentPosition);
                                if (iIndexOf2 >= 0) {
                                    groupedMessages.posArray.size();
                                    if ((currentPosition.flags & 4) != 0) {
                                        iB = iB + iIndexOf2 + 1;
                                    } else {
                                        iB++;
                                        int i15 = iIndexOf2 - 1;
                                        while (true) {
                                            if (i15 >= 0) {
                                                i10 = top2;
                                                if (groupedMessages.posArray.get(i15).maxY < currentPosition.minY) {
                                                    break;
                                                }
                                                iB++;
                                                i15--;
                                                top2 = i10;
                                            }
                                        }
                                    }
                                    i10 = top2;
                                    break;
                                }
                            } else {
                                i10 = top2;
                                iB++;
                            }
                            f2.o1 o1VarK = K(iB);
                            if (o1VarK == null) {
                                break;
                            }
                            View view2 = o1VarK.f5789a;
                            top = view2.getTop();
                            if (!(view2 instanceof org.telegram.ui.Cells.s1)) {
                                break;
                            }
                            s1Var = (org.telegram.ui.Cells.s1) view2;
                            float checkBoxTranslation2 = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                            if (z11 && checkBoxTranslation2 > f11) {
                                checkBoxTranslation = checkBoxTranslation2;
                            }
                            if (!s1Var.h()) {
                                break;
                            }
                            top2 = i10;
                        }
                        i10 = top2;
                        break;
                    }
                }
                i10 = top2;
                break;
                int iDp = i10 - AndroidUtilities.dp(42.0f) < top ? AndroidUtilities.dp(42.0f) + top : i10;
                if (!s1Var.j()) {
                    int bottom = z10 ? s1Var.getBottom() : (int) (s1Var.getY() + s1Var.getMeasuredHeight() + s1Var.getTransitionParams().f25128i0);
                    if (iDp > bottom) {
                        iDp = bottom;
                    }
                }
                canvas.save();
                if (checkBoxTranslation != f11) {
                    canvas.translate(checkBoxTranslation, 0.0f);
                }
                if (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                    iDp = (int) (iDp - s1Var.getTranslationY());
                }
                avatarImage.setImageY(iDp - AndroidUtilities.dp(40.0f));
                if (s1Var.a()) {
                    avatarImage.setAlpha(s1Var.getAlpha());
                    canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
                } else {
                    avatarImage.setAlpha(1.0f);
                }
                avatarImage.setVisible(true, false);
                avatarImage.draw(canvas);
                canvas.restore();
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    if (view.getTranslationY() != 0.0f) {
                        canvas.save();
                    }
                }
            }
        } else {
            f10 = 0.0f;
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        return zDrawChild;
    }
}
