package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.ik;
import org.telegram.ui.wj;
import org.telegram.ui.zn;
public final class t extends FrameLayout {
    public final zn f54783a;
    public s f54784b;
    public List f54785c;
    public boolean d;
    public MessageObject f54786e;
    public final int f54787f;
    public final int h;
    public float f54788n;
    public float f54789r;
    public float f54790s;
    public long v;
    public boolean f54791w;
    public boolean f54792x;
    public final int[] f54793y;

    public t(zn znVar, Context context) {
        super(context);
        this.f54785c = Collections.EMPTY_LIST;
        this.f54787f = 22;
        this.h = 24;
        this.f54793y = new int[2];
        setVisibility(8);
        this.f54783a = znVar;
        setClipToPadding(false);
        setClipChildren(false);
        znVar.f45023x0.j(new nh0(this, 24));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f54792x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new s0(this, 27));
        duration.addListener(new z4(this, 21));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages D8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f54785c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f54785c.get(0);
            if (messageObject.getGroupId() != 0 && (D8 = this.f54783a.D8(messageObject.getGroupId())) != null && (arrayList = D8.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        if (this.d && this.f54786e != null && this.f54784b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.v);
            this.v = System.currentTimeMillis();
            float f7 = this.f54788n;
            float f10 = this.f54789r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f54788n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f54788n = Math.max(f7 - f11, f10);
                }
                AndroidUtilities.runOnUIThread(new r(this, 0));
            }
            zn znVar = this.f54783a;
            wj wjVar = znVar.f45023x0;
            int[] iArr = this.f54793y;
            wjVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - znVar.N9;
            boolean z14 = false;
            for (int i12 = 0; i12 < wjVar.getChildCount(); i12++) {
                View childAt = wjVar.getChildAt(i12);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject.getId() == this.f54786e.getId()) {
                        boolean isOutOwner = messageObject.isOutOwner();
                        s sVar = this.f54784b;
                        if (sVar != null) {
                            sVar.setMirrorX(isOutOwner);
                            s sVar2 = this.f54784b;
                            int dp = AndroidUtilities.dp(4.0f);
                            boolean z15 = LocaleController.isRTL;
                            int i13 = this.h;
                            if (!z15 && !isOutOwner) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = dp + i11;
                            float f13 = this.f54787f;
                            int dp2 = AndroidUtilities.dp(f13);
                            int dp3 = AndroidUtilities.dp(4.0f);
                            if (!LocaleController.isRTL && !isOutOwner) {
                                i13 = 0;
                            }
                            sVar2.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(f13));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = wjVar.getHeight();
                        }
                        if (u1Var.getCurrentMessagesGroup() != null) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams = u1Var.getCurrentMessagesGroup().transitionParams;
                            height2 = transitionParams.bottom - transitionParams.top;
                        } else {
                            height2 = u1Var.getHeight();
                        }
                        float y3 = (u1Var.getY() + f12) - AndroidUtilities.dp(74.0f);
                        float dp4 = AndroidUtilities.dp(14.0f);
                        float dp5 = height - AndroidUtilities.dp(218.0f);
                        ik ikVar = znVar.X1;
                        if (ikVar != null && ikVar.getVisibility() == 0) {
                            dp4 += ikVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > dp4 - (f14 / 2.0f) && y3 < dp5) {
                            this.f54789r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (dp4 - f14) - AndroidUtilities.dp(92.0f) && y3 <= dp5) {
                                this.f54790s = AndroidUtilities.dp(56.0f) + height2;
                                this.f54789r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f54788n = this.f54789r;
                        }
                        float interpolation = (is.f27500f.getInterpolation(this.f54788n) * this.f54790s) + y3;
                        s sVar3 = this.f54784b;
                        if (sVar3 != null) {
                            if (z11 != sVar3.N) {
                                sVar3.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new r(this, 0));
                            }
                            if (z12 != this.f54784b.isEnabled()) {
                                this.f54784b.setEnabled(z12);
                                this.f54784b.invalidate();
                                if (z12) {
                                    this.f54784b.setVisibility(0);
                                    if (!this.f54792x) {
                                        this.f54792x = true;
                                        this.f54784b.p(this.f54786e, znVar.Z7, true);
                                    }
                                }
                            }
                            this.f54784b.setTranslationY(w7.o.a(interpolation, dp4, dp5));
                            this.f54784b.setTranslationX(u1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54784b.getLayoutParams();
                            int b10 = org.telegram.messenger.q.b(32.0f, u1Var.getBackgroundDrawableLeft(), 0);
                            int b11 = org.telegram.messenger.q.b(32.0f, u1Var.getWidth() - u1Var.getBackgroundDrawableRight(), (int) u1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - b11) - b10 < dp6) {
                                if (isOutOwner) {
                                    b10 = Math.min(b10, getWidth() - dp6);
                                    b11 = 0;
                                } else {
                                    b11 = Math.min(b11, getWidth() - dp6);
                                    b10 = 0;
                                }
                            }
                            if (isOutOwner) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                            if (i10 != layoutParams.gravity) {
                                layoutParams.gravity = i10;
                                z14 = true;
                            }
                            if (b10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = b10;
                                z14 = true;
                            }
                            if (b11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = b11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f54784b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            s sVar4 = this.f54784b;
            if (sVar4 != null && sVar4.isEnabled()) {
                this.f54784b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f54791w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f54791w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r10) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
