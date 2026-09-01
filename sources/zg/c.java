package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import fg.l0;
import jh.s;
import ng.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.d40;
import wh.v1;
public final class c extends ViewGroup implements yd.a, NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final Rect I = new Rect();
    public RenderNode B;
    public float C;
    public View D;
    public GroupCallMessage E;
    public a F;
    public final l0 G;
    public final RectF H;
    public final xd.a f51177a;
    public final xd.a f51178b;
    public final yd.b f51179c;
    public final ImageReceiver d;
    public final Paint f51180e;
    public final Paint f51181f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f51182n;
    public l5 f51183r;
    public q0 f51184s;
    public final s v;
    public c9.a f51185w;
    public boolean f51186x;
    public final v1 f51187y;

    public c(Context context) {
        super(context);
        pr prVar = pr.h;
        this.f51177a = new xd.a(0, this, prVar, 320L, false);
        this.f51178b = new xd.a(1, this, prVar, 320L, false);
        this.f51179c = new yd.b(this);
        Paint paint = new Paint(1);
        this.f51180e = paint;
        Paint paint2 = new Paint(1);
        this.f51181f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f51187y = new v1(this, 3);
        this.G = new l0(this, 9);
        this.H = new RectF();
        s sVar = new s(context);
        this.v = sVar;
        sVar.setDisablePaddingsOffset(true);
        sVar.setTextSize(14.0f);
        sVar.setTextColor(-1);
        sVar.setLinkTextColor(-11683585);
        sVar.setHintTextColor(-1);
        addView(sVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.f32053c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f51182n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: zg.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        this.f51181f.setAlpha(Math.round(this.f51178b.f50505e * 100.0f));
        int round = Math.round(this.f51177a.f50505e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f32051a.setAlpha(round);
        hVar.f32053c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        c9.a aVar = this.f51185w;
        if (aVar == null) {
            return -1;
        }
        RectF rectF = this.H;
        rectF.set((RectF) aVar.f2333e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f51185w.f2330a).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c9.a aVar = this.f51185w;
        if (aVar != null) {
            canvas.drawPath((Path) aVar.d, this.f51180e);
            if (Build.VERSION.SDK_INT >= 29 && this.B != null && canvas.isHardwareAccelerated()) {
                float f10 = 0.0f;
                View view = this;
                while (view != this.D) {
                    f10 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f51185w.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.C;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.B);
                canvas.restore();
            }
            Paint paint = this.f51181f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f51185w.d, paint);
            }
            if (this.f51177a.f50505e > 0.0f) {
                RectF rectF = this.H;
                rectF.set((RectF) this.f51185w.f2330a);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f51182n.draw(canvas);
            l5 l5Var = this.f51183r;
            if (l5Var != null) {
                l5Var.draw(canvas);
            }
        }
    }

    @Override
    public final boolean forceEnableVibration() {
        return false;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.E;
    }

    public float getReactionCenterX() {
        c9.a aVar = this.f51185w;
        if (aVar != null) {
            return ((RectF) aVar.f2334f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override
    public final boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public final boolean needClickAt(View view, float f10, float f11) {
        if (a(f10, f11) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f51182n.onAttachedToWindow();
        l5 l5Var = this.f51183r;
        if (l5Var != null) {
            l5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.E;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f51187y);
        }
    }

    @Override
    public final void onClickAt(View view, float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.F) != null && (groupCallMessage = this.E) != null) {
            ((d40) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f51182n.onDetachedFromWindow();
        l5 l5Var = this.f51183r;
        if (l5Var != null) {
            l5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.E;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f51187y);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        c9.a aVar = this.f51185w;
        if (aVar == null) {
            return;
        }
        int round = Math.round(((PointF) aVar.f2335g).x);
        int round2 = Math.round(((PointF) this.f51185w.f2335g).y);
        s sVar = this.v;
        sVar.layout(round, round2, sVar.getMeasuredWidth() + round, sVar.getMeasuredHeight() + round2);
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        boolean z4;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        c9.a aVar = this.f51185w;
        if (aVar == null || this.f51186x || aVar.f2331b != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            q0 q0Var = this.f51184s;
            int d = org.telegram.ui.b.d(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            s sVar = this.v;
            sVar.measure(d, makeMeasureSpec);
            float measuredWidth = sVar.getMeasuredWidth();
            if (q0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int b10 = y3.b(8.0f, sVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            ?? obj = new Object();
            obj.f2330a = new RectF();
            obj.d = new Path();
            obj.f2333e = new RectF();
            obj.f2334f = new RectF();
            obj.f2335g = new PointF();
            RectF rectF = (RectF) obj.f2333e;
            PointF pointF = (PointF) obj.f2335g;
            RectF rectF2 = (RectF) obj.f2334f;
            RectF rectF3 = (RectF) obj.f2330a;
            obj.f2331b = size;
            obj.f2332c = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (sVar.getLayout().getParagraphDirection(0) == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z4) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            if (z4) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - sVar.getLayout().getLineBaseline(0));
            if (z4) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f51185w = obj;
            this.d.setImageCoords(rectF);
            this.f51182n.setImageCoords((RectF) this.f51185w.f2334f);
            if (this.f51183r != null) {
                Rect rect = I;
                ((RectF) this.f51185w.f2334f).round(rect);
                this.f51183r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f51185w.f2332c);
        this.h.f32055f = Math.round(((RectF) this.f51185w.f2330a).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f51179c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c3;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        v1 v1Var = this.f51187y;
        if (isAttachedToWindow && (groupCallMessage3 = this.E) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(v1Var);
        }
        this.E = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.E) != null) {
            groupCallMessage2.subscribeToStateUpdates(v1Var);
        }
        GroupCallMessage groupCallMessage4 = this.E;
        if (groupCallMessage4 != null) {
            this.f51177a.a(groupCallMessage4.isSendDelayed(), false);
            this.f51178b.a(this.E.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        z8 z8Var = new z8((g6) null);
        z8Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, z8Var);
        ImageReceiver imageReceiver = this.f51182n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f51183r != null && isAttachedToWindow()) {
            this.f51183r.o(this);
        }
        this.f51183r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.G, 0, spannableStringBuilder.length(), 33);
        q0 q0Var = groupCallMessage.visibleReaction;
        s sVar = this.v;
        if (q0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, sVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(formatTextWithEntities);
            if (b10 != b11) {
                if (b11) {
                    c3 = 8295;
                } else {
                    c3 = 8294;
                }
                spannableStringBuilder2.append(c3);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(formatTextWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (q0Var.f16178f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f16178f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (q0Var.f16179g != 0) {
            l5 l5Var = new l5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f16179g);
            this.f51183r = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f51183r.a(this);
            }
        }
        this.f51184s = groupCallMessage.visibleReaction;
        this.f51186x = true;
        sVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f51180e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.F = aVar;
    }

    @Override
    public final void z(float f10, int i10) {
    }

    @Override
    public final void onClickTouchDown(View view, float f10, float f11) {
    }

    @Override
    public final void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public final void onClickTouchUp(View view, float f10, float f11) {
    }

    @Override
    public final void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public final void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public final void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
