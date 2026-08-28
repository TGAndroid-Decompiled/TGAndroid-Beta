package tg;

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
import dh.u;
import hg.r0;
import kh.lb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.n30;
import pf.o1;
public final class d extends ViewGroup implements ud.a, NotificationCenter.NotificationCenterDelegate, td.b {
    public static final Rect H = new Rect();
    public RenderNode A;
    public float B;
    public View C;
    public GroupCallMessage D;
    public a E;
    public final lb F;
    public final RectF G;
    public final td.a f47921a;
    public final td.a f47922b;
    public final ud.b f47923c;
    public final ImageReceiver d;
    public final Paint f47924e;
    public final Paint f47925f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f47926n;
    public k5 f47927r;
    public r0 f47928s;
    public final u v;
    public b f47929w;
    public boolean f47930x;
    public final o1 f47931y;

    public d(Context context) {
        super(context);
        gr grVar = gr.h;
        this.f47921a = new td.a(0, this, grVar, 320L, false);
        this.f47922b = new td.a(1, this, grVar, 320L, false);
        this.f47923c = new ud.b(this);
        Paint paint = new Paint(1);
        this.f47924e = paint;
        Paint paint2 = new Paint(1);
        this.f47925f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f47931y = new o1(this, 8);
        this.F = new lb(this, 7);
        this.G = new RectF();
        u uVar = new u(context);
        this.v = uVar;
        uVar.setDisablePaddingsOffset(true);
        uVar.setTextSize(14.0f);
        uVar.setTextColor(-1);
        uVar.setLinkTextColor(-11683585);
        uVar.setHintTextColor(-1);
        addView(uVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.f33539c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f47926n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.d.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        this.f47925f.setAlpha(Math.round(this.f47922b.f47775e * 100.0f));
        int round = Math.round(this.f47921a.f47775e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f33537a.setAlpha(round);
        hVar.f33539c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        b bVar = this.f47929w;
        if (bVar == null) {
            return -1;
        }
        RectF rectF = this.G;
        rectF.set((RectF) bVar.d);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f47929w.f47917c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b bVar = this.f47929w;
        if (bVar != null) {
            canvas.drawPath((Path) bVar.f47919f, this.f47924e);
            if (Build.VERSION.SDK_INT >= 29 && this.A != null && canvas.isHardwareAccelerated()) {
                float f10 = 0.0f;
                View view = this;
                while (view != this.C) {
                    f10 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f47929w.f47919f);
                canvas.translate(0.0f, -f10);
                float f11 = this.B;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.A);
                canvas.restore();
            }
            Paint paint = this.f47925f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f47929w.f47919f, paint);
            }
            if (this.f47921a.f47775e > 0.0f) {
                RectF rectF = this.G;
                rectF.set((RectF) this.f47929w.f47917c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f47926n.draw(canvas);
            k5 k5Var = this.f47927r;
            if (k5Var != null) {
                k5Var.draw(canvas);
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
        b bVar = this.f47929w;
        if (bVar != null) {
            return ((RectF) bVar.f47918e).centerX();
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
        this.f47926n.onAttachedToWindow();
        k5 k5Var = this.f47927r;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f47931y);
        }
    }

    @Override
    public final void onClickAt(View view, float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.E) != null && (groupCallMessage = this.D) != null) {
            ((n30) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f47926n.onDetachedFromWindow();
        k5 k5Var = this.f47927r;
        if (k5Var != null) {
            k5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f47931y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        b bVar = this.f47929w;
        if (bVar == null) {
            return;
        }
        int round = Math.round(((PointF) bVar.f47920g).x);
        int round2 = Math.round(((PointF) this.f47929w.f47920g).y);
        u uVar = this.v;
        uVar.layout(round, round2, uVar.getMeasuredWidth() + round, uVar.getMeasuredHeight() + round2);
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int ceil;
        int dp;
        boolean z10;
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        b bVar = this.f47929w;
        if (bVar == null || this.f47930x || bVar.f47915a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            r0 r0Var = this.f47928s;
            int d = ll.d(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            u uVar = this.v;
            uVar.measure(d, makeMeasureSpec);
            float measuredWidth = uVar.getMeasuredWidth();
            if (r0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i11 = dp + ceil;
            int z11 = l0.z(8.0f, uVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            b bVar2 = new b();
            RectF rectF = (RectF) bVar2.d;
            PointF pointF = (PointF) bVar2.f47920g;
            RectF rectF2 = (RectF) bVar2.f47918e;
            RectF rectF3 = (RectF) bVar2.f47917c;
            bVar2.f47915a = size;
            bVar2.f47916b = z11;
            rectF3.set(0.0f, 0.0f, i11, z11);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) bVar2.f47919f).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (uVar.getLayout().getParagraphDirection(0) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z10) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            if (z10) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - uVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f47929w = bVar2;
            this.d.setImageCoords(rectF);
            this.f47926n.setImageCoords((RectF) this.f47929w.f47918e);
            if (this.f47927r != null) {
                Rect rect = H;
                ((RectF) this.f47929w.f47918e).round(rect);
                this.f47927r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f47929w.f47916b);
        this.h.f33541f = Math.round(((RectF) this.f47929w.f47917c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f47923c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        o1 o1Var = this.f47931y;
        if (isAttachedToWindow && (groupCallMessage3 = this.D) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(o1Var);
        }
        this.D = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.D) != null) {
            groupCallMessage2.subscribeToStateUpdates(o1Var);
        }
        GroupCallMessage groupCallMessage4 = this.D;
        if (groupCallMessage4 != null) {
            this.f47921a.a(groupCallMessage4.isSendDelayed(), false);
            this.f47922b.a(this.D.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        z8 z8Var = new z8((b6) null);
        z8Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, z8Var);
        ImageReceiver imageReceiver = this.f47926n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f47927r != null && isAttachedToWindow()) {
            this.f47927r.o(this);
        }
        this.f47927r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.F, 0, spannableStringBuilder.length(), 33);
        r0 r0Var = groupCallMessage.visibleReaction;
        u uVar = this.v;
        if (r0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, uVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(formatTextWithEntities);
            if (b10 != b11) {
                if (b11) {
                    c10 = 8295;
                } else {
                    c10 = 8294;
                }
                spannableStringBuilder2.append(c10);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(formatTextWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (r0Var.f10717f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f10717f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (r0Var.f10718g != 0) {
            k5 k5Var = new k5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f10718g);
            this.f47927r = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f47927r.a(this);
            }
        }
        this.f47928s = groupCallMessage.visibleReaction;
        this.f47930x = true;
        uVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.f47924e.setColor(i9);
    }

    public void setDelegate(a aVar) {
        this.E = aVar;
    }

    @Override
    public final void B(float f10, int i9) {
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
