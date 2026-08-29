package wg;

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
import cg.l0;
import gh.s;
import kg.q0;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t41;
import org.telegram.ui.q30;
import org.telegram.ui.web.t1;
public final class c extends ViewGroup implements wd.a, NotificationCenter.NotificationCenterDelegate, vd.b {
    public static final Rect H = new Rect();
    public RenderNode A;
    public float B;
    public View C;
    public GroupCallMessage D;
    public a E;
    public final l0 F;
    public final RectF G;
    public final vd.a f49964a;
    public final vd.a f49965b;
    public final wd.b f49966c;
    public final ImageReceiver d;
    public final Paint f49967e;
    public final Paint f49968f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f49969n;
    public p5 f49970r;
    public q0 f49971s;
    public final s v;
    public a9.a f49972w;
    public boolean f49973x;
    public final t1 f49974y;

    public c(Context context) {
        super(context);
        jr jrVar = jr.h;
        this.f49964a = new vd.a(0, this, jrVar, 320L, false);
        this.f49965b = new vd.a(1, this, jrVar, 320L, false);
        this.f49966c = new wd.b(this);
        Paint paint = new Paint(1);
        this.f49967e = paint;
        Paint paint2 = new Paint(1);
        this.f49968f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f49974y = new t1(this, 29);
        this.F = new l0(this, 9);
        this.G = new RectF();
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
        hVar.f33718c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f49969n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: wg.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        this.f49968f.setAlpha(Math.round(this.f49965b.f49505e * 100.0f));
        int round = Math.round(this.f49964a.f49505e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f33716a.setAlpha(round);
        hVar.f33718c.setAlpha(round);
        invalidate();
    }

    public final int a(float f9, float f10) {
        a9.a aVar = this.f49972w;
        if (aVar == null) {
            return -1;
        }
        RectF rectF = this.G;
        rectF.set((RectF) aVar.f229e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f9, f10)) {
            return 1;
        }
        if (!((RectF) this.f49972w.f228c).contains(f9, f10)) {
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
        a9.a aVar = this.f49972w;
        if (aVar != null) {
            canvas.drawPath((Path) aVar.d, this.f49967e);
            if (Build.VERSION.SDK_INT >= 29 && this.A != null && canvas.isHardwareAccelerated()) {
                float f9 = 0.0f;
                View view = this;
                while (view != this.C) {
                    f9 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f49972w.d);
                canvas.translate(0.0f, -f9);
                float f10 = this.B;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.A);
                canvas.restore();
            }
            Paint paint = this.f49968f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f49972w.d, paint);
            }
            if (this.f49964a.f49505e > 0.0f) {
                RectF rectF = this.G;
                rectF.set((RectF) this.f49972w.f228c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f49969n.draw(canvas);
            p5 p5Var = this.f49970r;
            if (p5Var != null) {
                p5Var.draw(canvas);
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
        return this.D;
    }

    public float getReactionCenterX() {
        a9.a aVar = this.f49972w;
        if (aVar != null) {
            return ((RectF) aVar.f230f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        return false;
    }

    @Override
    public final boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public final boolean needClickAt(View view, float f9, float f10) {
        if (a(f9, f10) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needLongPress(float f9, float f10) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f49969n.onAttachedToWindow();
        p5 p5Var = this.f49970r;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f49974y);
        }
    }

    @Override
    public final void onClickAt(View view, float f9, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f9, f10) == 1 && (aVar = this.E) != null && (groupCallMessage = this.D) != null) {
            ((q30) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f49969n.onDetachedFromWindow();
        p5 p5Var = this.f49970r;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f49974y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a9.a aVar = this.f49972w;
        if (aVar == null) {
            return;
        }
        int round = Math.round(((PointF) aVar.f231g).x);
        int round2 = Math.round(((PointF) this.f49972w.f231g).y);
        s sVar = this.v;
        sVar.layout(round, round2, sVar.getMeasuredWidth() + round, sVar.getMeasuredHeight() + round2);
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f9, float f10) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        boolean z10;
        float f9;
        int size = View.MeasureSpec.getSize(i10);
        a9.a aVar = this.f49972w;
        if (aVar == null || this.f49973x || aVar.f226a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            q0 q0Var = this.f49971s;
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
            int b10 = x3.b(8.0f, sVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            a9.a aVar2 = new a9.a();
            RectF rectF = (RectF) aVar2.f229e;
            PointF pointF = (PointF) aVar2.f231g;
            RectF rectF2 = (RectF) aVar2.f230f;
            RectF rectF3 = (RectF) aVar2.f228c;
            aVar2.f226a = size;
            aVar2.f227b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) aVar2.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (sVar.getLayout().getParagraphDirection(0) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z10) {
                f9 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f9 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
            if (z10) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - sVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f49972w = aVar2;
            this.d.setImageCoords(rectF);
            this.f49969n.setImageCoords((RectF) this.f49972w.f230f);
            if (this.f49970r != null) {
                Rect rect = H;
                ((RectF) this.f49972w.f230f).round(rect);
                this.f49970r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f49972w.f227b);
        this.h.f33720f = Math.round(((RectF) this.f49972w.f228c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49966c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c3;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        t1 t1Var = this.f49974y;
        if (isAttachedToWindow && (groupCallMessage3 = this.D) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(t1Var);
        }
        this.D = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.D) != null) {
            groupCallMessage2.subscribeToStateUpdates(t1Var);
        }
        GroupCallMessage groupCallMessage4 = this.D;
        if (groupCallMessage4 != null) {
            this.f49964a.a(groupCallMessage4.isSendDelayed(), false);
            this.f49965b.a(this.D.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        e9 e9Var = new e9((c6) null);
        e9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, e9Var);
        ImageReceiver imageReceiver = this.f49969n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f49970r != null && isAttachedToWindow()) {
            this.f49970r.o(this);
        }
        this.f49970r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.F, 0, spannableStringBuilder.length(), 33);
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
        } else if (q0Var.f13825f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f13825f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (q0Var.f13826g != 0) {
            p5 p5Var = new p5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f13826g);
            this.f49970r = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f49970r.a(this);
            }
        }
        this.f49971s = groupCallMessage.visibleReaction;
        this.f49973x = true;
        sVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f49967e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.E = aVar;
    }

    @Override
    public final void z(float f9, int i10) {
    }

    @Override
    public final void onClickTouchDown(View view, float f9, float f10) {
    }

    @Override
    public final void onClickTouchMove(View view, float f9, float f10) {
    }

    @Override
    public final void onClickTouchUp(View view, float f9, float f10) {
    }

    @Override
    public final void onLongPressCancelled(View view, float f9, float f10) {
    }

    @Override
    public final void onLongPressFinish(View view, float f9, float f10) {
    }

    @Override
    public final void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }
}
