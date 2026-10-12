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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.ak;
import org.telegram.ui.eo;
import org.telegram.ui.mk;
public final class t extends FrameLayout {
    public final eo f54894a;
    public s f54895b;
    public List f54896c;
    public boolean d;
    public MessageObject f54897e;
    public final int f54898f;
    public final int h;
    public float f54899n;
    public float f54900r;
    public float f54901s;
    public long v;
    public boolean f54902w;
    public boolean f54903x;
    public final int[] f54904y;

    public t(eo eoVar, Context context) {
        super(context);
        this.f54896c = Collections.EMPTY_LIST;
        this.f54898f = 22;
        this.h = 24;
        this.f54904y = new int[2];
        setVisibility(8);
        this.f54894a = eoVar;
        setClipToPadding(false);
        setClipChildren(false);
        eoVar.f37483x0.j(new qh0(this, 24));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f54903x = false;
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
        if (this.d && !this.f54896c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f54896c.get(0);
            if (messageObject.getGroupId() != 0 && (D8 = this.f54894a.D8(messageObject.getGroupId())) != null && (arrayList = D8.messages) != null) {
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
        if (this.d && this.f54897e != null && this.f54895b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.v);
            this.v = System.currentTimeMillis();
            float f7 = this.f54899n;
            float f10 = this.f54900r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f54899n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f54899n = Math.max(f7 - f11, f10);
                }
                AndroidUtilities.runOnUIThread(new r(this, 0));
            }
            eo eoVar = this.f54894a;
            ak akVar = eoVar.f37483x0;
            int[] iArr = this.f54904y;
            akVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - eoVar.N9;
            boolean z14 = false;
            for (int i12 = 0; i12 < akVar.getChildCount(); i12++) {
                View childAt = akVar.getChildAt(i12);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject.getId() == this.f54897e.getId()) {
                        boolean isOutOwner = messageObject.isOutOwner();
                        s sVar = this.f54895b;
                        if (sVar != null) {
                            sVar.setMirrorX(isOutOwner);
                            s sVar2 = this.f54895b;
                            int dp = AndroidUtilities.dp(4.0f);
                            boolean z15 = LocaleController.isRTL;
                            int i13 = this.h;
                            if (!z15 && !isOutOwner) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = dp + i11;
                            float f13 = this.f54898f;
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
                            height = akVar.getHeight();
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
                        mk mkVar = eoVar.X1;
                        if (mkVar != null && mkVar.getVisibility() == 0) {
                            dp4 += mkVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > dp4 - (f14 / 2.0f) && y3 < dp5) {
                            this.f54900r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (dp4 - f14) - AndroidUtilities.dp(92.0f) && y3 <= dp5) {
                                this.f54901s = AndroidUtilities.dp(56.0f) + height2;
                                this.f54900r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f54899n = this.f54900r;
                        }
                        float interpolation = (js.f27634f.getInterpolation(this.f54899n) * this.f54901s) + y3;
                        s sVar3 = this.f54895b;
                        if (sVar3 != null) {
                            if (z11 != sVar3.N) {
                                sVar3.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new r(this, 0));
                            }
                            if (z12 != this.f54895b.isEnabled()) {
                                this.f54895b.setEnabled(z12);
                                this.f54895b.invalidate();
                                if (z12) {
                                    this.f54895b.setVisibility(0);
                                    if (!this.f54903x) {
                                        this.f54903x = true;
                                        this.f54895b.p(this.f54897e, eoVar.Z7, true);
                                    }
                                }
                            }
                            this.f54895b.setTranslationY(w7.n.a(interpolation, dp4, dp5));
                            this.f54895b.setTranslationX(u1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54895b.getLayoutParams();
                            int f15 = hg.c.f(32.0f, u1Var.getBackgroundDrawableLeft(), 0);
                            int f16 = hg.c.f(32.0f, u1Var.getWidth() - u1Var.getBackgroundDrawableRight(), (int) u1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - f16) - f15 < dp6) {
                                if (isOutOwner) {
                                    f15 = Math.min(f15, getWidth() - dp6);
                                    f16 = 0;
                                } else {
                                    f16 = Math.min(f16, getWidth() - dp6);
                                    f15 = 0;
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
                            if (f15 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = f15;
                                z14 = true;
                            }
                            if (f16 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = f16;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f54895b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            s sVar4 = this.f54895b;
            if (sVar4 != null && sVar4.isEnabled()) {
                this.f54895b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f54902w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f54902w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r10) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
