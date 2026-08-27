package ug;

import ag.x0;
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
import eh.s;
import ig.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.y8;
import org.telegram.ui.q30;

public final class d extends ViewGroup implements vd.a, NotificationCenter.NotificationCenterDelegate, ud.b {
    public static final Rect H = new Rect();
    public RenderNode A;
    public float B;
    public View C;
    public GroupCallMessage D;
    public a E;
    public final x0 F;
    public final RectF G;

    public final ud.a f48643a;

    public final ud.a f48644b;

    public final vd.b f48645c;
    public final ImageReceiver d;

    public final Paint f48646e;

    public final Paint f48647f;
    public final org.telegram.ui.Components.voip.h h;

    public final ImageReceiver f48648n;

    public k5 f48649r;

    public q0 f48650s;
    public final s v;

    public b f48651w;

    public boolean f48652x;

    public final qf.b f48653y;

    public d(Context context) {
        super(context);
        er erVar = er.h;
        this.f48643a = new ud.a(0, this, erVar, 320L, false);
        this.f48644b = new ud.a(1, this, erVar, 320L, false);
        this.f48645c = new vd.b(this);
        Paint paint = new Paint(1);
        this.f48646e = paint;
        Paint paint2 = new Paint(1);
        this.f48647f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f48653y = new qf.b(this, 15);
        this.F = new x0(this, 9);
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
        hVar.f33589c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f48648n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            byte directionality = Character.getDirectionality(iCodePointAt);
            if (directionality == 0) {
                break;
            }
            if (directionality == 1 || directionality == 2) {
                return true;
            }
        }
        return false;
    }

    public final int a(float f10, float f11) {
        b bVar = this.f48651w;
        if (bVar == null) {
            return -1;
        }
        RectF rectF = (RectF) bVar.d;
        RectF rectF2 = this.G;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return ((RectF) this.f48651w.f48639c).contains(f10, f11) ? 0 : -1;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b bVar = this.f48651w;
        if (bVar == null) {
            return;
        }
        canvas.drawPath((Path) bVar.f48641f, this.f48646e);
        if (Build.VERSION.SDK_INT >= 29 && this.A != null && canvas.isHardwareAccelerated()) {
            float y10 = 0.0f;
            View view = this;
            while (view != this.C) {
                y10 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.f48651w.f48641f);
            canvas.translate(0.0f, -y10);
            float f10 = this.B;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(this.A);
            canvas.restore();
        }
        Paint paint = this.f48647f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.f48651w.f48641f, paint);
        }
        if (this.f48643a.f48497e > 0.0f) {
            RectF rectF = (RectF) this.f48651w.f48639c;
            RectF rectF2 = this.G;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.draw(canvas);
        this.f48648n.draw(canvas);
        k5 k5Var = this.f48649r;
        if (k5Var != null) {
            k5Var.draw(canvas);
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
        b bVar = this.f48651w;
        if (bVar != null) {
            return ((RectF) bVar.f48640e).centerX();
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
        return a(f10, f11) == 1;
    }

    @Override
    public final boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        this.f48647f.setAlpha(Math.round(this.f48644b.f48497e * 100.0f));
        int iRound = Math.round(this.f48643a.f48497e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f33587a.setAlpha(iRound);
        hVar.f33589c.setAlpha(iRound);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f48648n.onAttachedToWindow();
        k5 k5Var = this.f48649r;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f48653y);
        }
    }

    @Override
    public final void onClickAt(View view, float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) != 1 || (aVar = this.E) == null || (groupCallMessage = this.D) == null) {
            return;
        }
        ((q30) aVar).a(groupCallMessage);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f48648n.onDetachedFromWindow();
        k5 k5Var = this.f48649r;
        if (k5Var != null) {
            k5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f48653y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b bVar = this.f48651w;
        if (bVar == null) {
            return;
        }
        int iRound = Math.round(((PointF) bVar.f48642g).x);
        int iRound2 = Math.round(((PointF) this.f48651w.f48642g).y);
        s sVar = this.v;
        sVar.layout(iRound, iRound2, sVar.getMeasuredWidth() + iRound, sVar.getMeasuredHeight() + iRound2);
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iCeil;
        int iDp;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        b bVar = this.f48651w;
        if (bVar == null || this.f48652x || bVar.f48637a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            q0 q0Var = this.f48650s;
            int iD = rl.d(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            s sVar = this.v;
            sVar.measure(iD, iMakeMeasureSpec);
            float measuredWidth = sVar.getMeasuredWidth();
            if (q0Var == null) {
                iCeil = (int) Math.ceil(measuredWidth);
                iDp = AndroidUtilities.dp(44.0f);
            } else {
                iCeil = (int) Math.ceil(measuredWidth);
                iDp = AndroidUtilities.dp(70.0f);
            }
            int i12 = iDp + iCeil;
            int iB = y1.b(8.0f, sVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            b bVar2 = new b();
            RectF rectF = (RectF) bVar2.d;
            PointF pointF = (PointF) bVar2.f48642g;
            RectF rectF2 = (RectF) bVar2.f48640e;
            RectF rectF3 = (RectF) bVar2.f48639c;
            bVar2.f48637a = size;
            bVar2.f48638b = iB;
            rectF3.set(0.0f, 0.0f, i12, iB);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) bVar2.f48641f).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z10 = sVar.getLayout().getParagraphDirection(0) == -1;
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
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - sVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f48651w = bVar2;
            this.d.setImageCoords(rectF);
            this.f48648n.setImageCoords((RectF) this.f48651w.f48640e);
            if (this.f48649r != null) {
                RectF rectF4 = (RectF) this.f48651w.f48640e;
                Rect rect = H;
                rectF4.round(rect);
                this.f48649r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f48651w.f48638b);
        this.h.f33591f = Math.round(((RectF) this.f48651w.f48639c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f48645c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean zIsAttachedToWindow = isAttachedToWindow();
        qf.b bVar = this.f48653y;
        if (zIsAttachedToWindow && (groupCallMessage3 = this.D) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(bVar);
        }
        this.D = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.D) != null) {
            groupCallMessage2.subscribeToStateUpdates(bVar);
        }
        GroupCallMessage groupCallMessage4 = this.D;
        if (groupCallMessage4 != null) {
            this.f48643a.a(groupCallMessage4.isSendDelayed(), false);
            this.f48644b.a(this.D.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        y8 y8Var = new y8((c6) null);
        y8Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, y8Var);
        ImageReceiver imageReceiver = this.f48648n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f48649r != null && isAttachedToWindow()) {
            this.f48649r.o(this);
        }
        this.f48649r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.F, 0, spannableStringBuilder.length(), 33);
        q0 q0Var = groupCallMessage.visibleReaction;
        s sVar = this.v;
        if (q0Var == null) {
            CharSequence textWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, sVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean zB = b(spannableStringBuilder);
            boolean zB2 = b(textWithEntities);
            if (zB != zB2) {
                spannableStringBuilder2.append(zB2 ? (char) 8295 : (char) 8294);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(textWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (q0Var.f11412f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f11412f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (q0Var.f11413g != 0) {
            k5 k5Var = new k5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f11413g);
            this.f48649r = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f48649r.a(this);
            }
        }
        this.f48650s = groupCallMessage.visibleReaction;
        this.f48652x = true;
        sVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f48646e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.E = aVar;
    }

    @Override
    public final void A(float f10, int i10) {
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
