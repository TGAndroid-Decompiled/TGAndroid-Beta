package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z50 extends FrameLayout {
    public int B;
    public int C;
    public float D;
    public long E;
    public final float[] F;
    public boolean G;
    public final c60 H;
    public final org.telegram.ui.Components.jj0 f40675a;
    public final TextView f40676b;
    public final TLRPC.GroupCallParticipant f40677c;
    public final org.telegram.ui.Components.gj0 d;
    public boolean e;
    public float f40678f;
    public float h;
    public int f40679n;
    public double f40680r;
    public final Paint f40681s;
    public final Paint v;
    public final Path f40682w;
    public final float[] f40683x;
    public final RectF f40684y;

    public z50(c60 c60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        this.H = c60Var;
        this.f40681s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f40682w = new Path();
        this.f40683x = new float[8];
        this.f40684y = new RectF();
        this.F = new float[3];
        setWillNotDraw(false);
        this.f40677c = groupCallParticipant;
        this.f40680r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.D = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = gj0Var;
        ?? imageView = new ImageView(context);
        this.f40675a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(gj0Var);
        if (this.f40680r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView((View) imageView, k7.b6.d(-2, 40.0f, i10 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f40680r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        gj0Var.N(i11);
        gj0Var.L(gj0Var.f25154f - 1, false, true);
        TextView textView = new TextView(context);
        this.f40676b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(43.0f);
        }
        if (LocaleController.isRTL) {
            i12 = AndroidUtilities.dp(43.0f);
        } else {
            i12 = 0;
        }
        textView.setPadding(dp, 0, i12, 0);
        addView(textView, k7.b6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i14 = 0;
        while (true) {
            float[] fArr = this.F;
            if (i14 < fArr.length) {
                if (i14 == 0) {
                    i13 = 0;
                } else if (i14 == 1) {
                    i13 = 50;
                } else {
                    i13 = 150;
                }
                if (participantVolume2 > i13) {
                    fArr[i14] = 1.0f;
                } else {
                    fArr[i14] = 0.0f;
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z4) {
        double d10;
        int i10;
        TLObject chat;
        int i11;
        c60 c60Var = this.H;
        AccountInstance accountInstance = c60Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f40680r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f40677c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i12 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (participantVolume > 0.0d) {
                d10 = Math.max(participantVolume, 1.0d);
            } else {
                d10 = 0.0d;
            }
            this.f40676b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z4) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (peerId > 0) {
                    chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                TLObject tLObject = chat;
                if (groupCallParticipant.volume == 0) {
                    d50 d50Var = c60Var.c3;
                    if (d50Var != null) {
                        d50Var.dismiss();
                        c60Var.c3 = null;
                    }
                    c60Var.d1(true);
                    if (c60Var.Q0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    c60Var.x1(groupCallParticipant, peerId, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f40680r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.jj0 jj0Var = this.f40675a;
            if ((jj0Var.getTag() == null && num != null) || (jj0Var.getTag() != null && num == null)) {
                if (this.f40680r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.gj0 gj0Var = this.d;
                gj0Var.N(i10);
                if (this.f40680r != 0.0d) {
                    i12 = 17;
                }
                gj0Var.K(i12);
                gj0Var.start();
                jj0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40678f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f40678f) > viewConfiguration.getScaledTouchSlop()) {
                        this.e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f40679n = x10;
                            if (x10 < 0) {
                                this.f40679n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f40679n = getMeasuredWidth();
                            }
                            this.G = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.G) {
                    int x11 = (int) motionEvent.getX();
                    this.f40679n = x11;
                    if (x11 < 0) {
                        this.f40679n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f40679n = getMeasuredWidth();
                    }
                    a(this.f40679n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f40679n = x12;
                    if (x12 < 0) {
                        this.f40679n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f40679n = getMeasuredWidth();
                    }
                    this.G = true;
                }
            }
            if (this.G) {
                if (motionEvent.getAction() == 1) {
                    a(this.f40679n / getMeasuredWidth(), true);
                }
                this.G = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float dp;
        int i11;
        z50 z50Var = this;
        int i12 = z50Var.B;
        double d = z50Var.f40680r;
        if (d < 0.25d) {
            z50Var.B = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            z50Var.B = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            z50Var.B = -11027349;
        } else {
            z50Var.B = -11688225;
        }
        if (i12 == 0) {
            i10 = z50Var.B;
            z50Var.D = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(z50Var.C, i12, z50Var.D, 1.0f);
            if (i12 != z50Var.B) {
                z50Var.D = 0.0f;
                z50Var.C = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = z50Var.f40681s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - z50Var.E;
        if (j10 > 17) {
            j10 = 17;
        }
        z50Var.E = elapsedRealtime;
        float f11 = z50Var.D;
        if (f11 < 1.0f) {
            float f12 = (((float) j10) / 200.0f) + f11;
            z50Var.D = f12;
            if (f12 > 1.0f) {
                z50Var.D = 1.0f;
            } else {
                z50Var.invalidate();
            }
        }
        Path path = z50Var.f40682w;
        path.reset();
        float f13 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = z50Var.f40683x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i13 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        if (z50Var.f40679n < AndroidUtilities.dp(12.0f)) {
            f10 = Math.max(0.0f, (z50Var.f40679n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f10 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f10;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = z50Var.f40684y;
        rectF.set(0.0f, 0.0f, z50Var.f40679n, z50Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(z50Var.f40677c) / 100.0d);
        org.telegram.ui.Components.jj0 jj0Var = z50Var.f40675a;
        int dp4 = AndroidUtilities.dp(5.0f) + (jj0Var.getMeasuredWidth() / 2) + jj0Var.getLeft();
        int measuredHeight = (jj0Var.getMeasuredHeight() / 2) + jj0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = z50Var.F;
            if (i14 < fArr2.length) {
                if (i14 == 0) {
                    dp = AndroidUtilities.dp(f13);
                    i11 = 0;
                } else if (i14 == i13) {
                    dp = AndroidUtilities.dp(10.0f);
                    i11 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i11 = 150;
                }
                float f14 = fArr2[i14];
                float dp5 = (1.0f - f14) * AndroidUtilities.dp(2.0f);
                Paint paint2 = z50Var.v;
                paint2.setAlpha((int) (255.0f * f14));
                float f15 = dp4;
                float f16 = measuredHeight;
                rectF.set((f15 - dp) + dp5, (f16 - dp) + dp5, (f15 + dp) - dp5, (f16 + dp) - dp5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i11) {
                    float f17 = fArr2[i14];
                    if (f17 < 1.0f) {
                        float f18 = (((float) j10) / 180.0f) + f17;
                        fArr2[i14] = f18;
                        if (f18 > 1.0f) {
                            fArr2[i14] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f19 = fArr2[i14];
                    if (f19 > 0.0f) {
                        float f20 = f19 - (((float) j10) / 180.0f);
                        fArr2[i14] = f20;
                        if (f20 < 0.0f) {
                            fArr2[i14] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i14++;
                canvas2 = canvas;
                f13 = 6.0f;
                i13 = 1;
                z50Var = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.f40679n = (int) (View.MeasureSpec.getSize(i10) * this.f40680r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
