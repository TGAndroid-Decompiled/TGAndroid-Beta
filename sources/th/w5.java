package th;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.u10;
public abstract class w5 {
    public static u10 f49574b;
    public static u10 f49575c;
    public static u10 d;
    public static Paint e;
    public static RectF f49576f;
    public static Paint f49577g;
    public static Paint h;
    public static qz0 f49578i;
    public static int f49579j;
    public static BitmapDrawable f49582m;
    public static final u10[] f49573a = new u10[2];
    public static final Paint[] f49580k = new Paint[2];
    public static final int[] f49581l = new int[2];
    public static final RectF f49583n = new RectF();
    public static final androidx.emoji2.text.n f49584o = new androidx.emoji2.text.n(8);
    public static final RectF f49585p = new RectF();
    public static final Path f49586q = new Path();
    public static final Matrix f49587r = new Matrix();
    public static final PathMeasure f49588s = new PathMeasure();
    public static final Path f49589t = new Path();

    public static void a(org.telegram.ui.ActionBar.u5 u5Var) {
        String L0 = cd.L0(2131743826, null);
        if (L0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
            u7 u7Var = new u7();
            valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
            u7Var.f49530a = u5Var;
            u7Var.f49534n = true;
            u5Var.l(valueOf, false);
            return;
        }
        u5Var.l(L0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == d20.i(d20.f15147s0).f15165n && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f19942id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.p6 p6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(org.telegram.messenger.i0.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var);
        if (f49579j != w02) {
            f49579j = w02;
            float B = org.telegram.messenger.i0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    e.setColor(i0.b.f(0.2f, w02, -1));
                    return;
                } else {
                    e.setColor(i0.b.f(0.44f, w02, -1));
                    return;
                }
            }
            e.setColor(i0.b.f(0.2f, w02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        int i10;
        Paint[] paintArr = f49580k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(org.telegram.messenger.i0.N(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.t6.f21206s8;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.M8;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int[] iArr = f49581l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float B = org.telegram.messenger.i0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.2f, w02, -1));
                    return;
                } else {
                    paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.44f, w02, -1));
                    return;
                }
            }
            paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.2f, w02, -16777216));
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) cd.a0(null, null, i10, objArr));
        dq dqVar = new dq(2131232232, 0);
        if (z10) {
            dqVar.H = 0.8f;
            dqVar.I = 0.8f;
        } else {
            dqVar.f25507n = -1;
        }
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) cd.L0(2131744753, null));
        spannableStringBuilder.setSpan(new dq(2131232247, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f7;
        if (f7 < f11 && f10 < f11 + f14) {
            f13 = f7;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f7, false, paint);
            z10 = true;
        } else {
            f13 = f7;
            z10 = false;
        }
        float max = Math.max(f13, f12);
        float min = Math.min(f10, f11 + 360.0f);
        if (min < max) {
            if (!z10) {
                if (f13 <= f11 || f10 >= f12) {
                    canvas.drawArc(rectF, f13, f14, false, paint);
                    return;
                }
                return;
            }
            return;
        }
        canvas.drawArc(rectF, max, min - max, false, paint);
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, t5 t5Var) {
        boolean z10;
        boolean K = vp.r1(d20.f15147s0).O1().K(j10);
        if (d20.i(d20.f15147s0).e() != j10 && K) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j10, canvas, imageReceiver, z10, t5Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, th.t5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: th.w5.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, th.t5):void");
    }

    public static void j(Canvas canvas, t5 t5Var, Paint paint, boolean z10) {
        RectF rectF = f49583n;
        if (z10) {
            RectF rectF2 = f49585p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
            return;
        }
        float f7 = t5Var.f49468f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (f49578i == null) {
            f49578i = new qz0(cd.L0(2131748835, null), 9.66f, org.telegram.messenger.i0.o());
        }
        if (f49577g == null) {
            Paint paint = new Paint(1);
            f49577g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f49576f == null) {
            f49576f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.t6.r1(f7, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false)));
        float W1 = org.telegram.messenger.i0.W1(f10, org.telegram.messenger.i0.L(4.66f), org.telegram.messenger.i0.L(7.0f));
        float W12 = org.telegram.messenger.i0.W1(f10, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(18.0f));
        float L = org.telegram.messenger.i0.L(2.0f);
        canvas.save();
        float k10 = ((f49578i.k() + W1) + W1) / 2.0f;
        float f11 = 0.8f * W12;
        float f12 = W12 * 0.2f;
        f49576f.set((rectF.centerX() - k10) - L, (rectF.bottom - f11) - L, rectF.centerX() + k10 + L, rectF.bottom + f12 + L);
        float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, f7);
        canvas.scale(T1, T1, f49576f.centerX(), f49576f.centerY());
        RectF rectF2 = f49576f;
        org.telegram.messenger.i0.i3(rectF2, f7, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f49576f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f49576f.height() / 2.0f, f49577g);
        if (z10) {
            f49576f.set(rectF.centerX() - k10, rectF.bottom - f11, rectF.centerX() + k10, rectF.bottom + f12);
            RectF rectF4 = f49576f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f49576f.height() / 2.0f, h);
            qz0 qz0Var = f49578i;
            RectF rectF5 = f49576f;
            canvas2 = canvas;
            qz0Var.c(rectF5.left + W1, rectF5.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, t5 t5Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = f49586q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f49587r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f49588s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f49589t;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (t5Var.f49472k) {
            boolean z11 = t5Var.f49474m;
            if (!z11 && !t5Var.f49473l) {
                if (f7 < 90.0f) {
                    float f13 = t5Var.f49468f;
                    g(canvas, rectF, paint, f7, f10, (-f13) / 2.0f, f13 / 2.0f);
                    return;
                }
                float f14 = t5Var.f49468f;
                g(canvas, rectF, paint, f7, f10, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
            } else if (t5Var.f49473l) {
                float f15 = t5Var.f49468f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (z11) {
                float f16 = t5Var.f49468f;
                g(canvas, rectF, paint, f7, f10, (-f16) / 2.0f, f16 / 2.0f);
            } else {
                canvas.drawArc(rectF, f7, f10 - f7, false, paint);
            }
        } else if (t5Var.f49473l) {
            float f17 = t5Var.f49468f;
            g(canvas, rectF, paint, f7, f10, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (f7 < 90.0f) {
            g(canvas, rectF, paint, f7, f10, t5Var.f49469g, t5Var.h);
        } else {
            g(canvas, rectF, paint, f7, f10, -t5Var.f49470i, t5Var.f49471j);
        }
    }

    public static void m(android.graphics.Canvas r23, th.e5 r24, org.telegram.messenger.ImageReceiver r25, th.t5 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: th.w5.m(android.graphics.Canvas, th.e5, org.telegram.messenger.ImageReceiver, th.t5, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static org.telegram.ui.web.x0 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && org.telegram.messenger.o5.o(peerStories.peer) != d20.i(d20.f15147s0).f15165n) {
            e5 e5Var = vp.r1(d20.f15147s0).f18797h0;
            int i10 = e5Var.f48907f.get(org.telegram.messenger.o5.o(peerStories.peer));
            int i11 = 0;
            while (true) {
                if (i11 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i11).f20031id > i10) {
                        storyItem = peerStories.stories.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    storyItem = null;
                    break;
                }
            }
            if (storyItem == null) {
                storyItem = peerStories.stories.get(0);
            }
            TL_stories.StoryItem storyItem2 = storyItem;
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia != null && messageMedia.document != null) {
                b8.G(d20.f15147s0);
                File K = b8.K(storyItem2.media.document, "", false, true);
                if (K != null && K.exists()) {
                    runnable.run();
                    return null;
                }
                b8.G(d20.f15147s0);
                File K2 = b8.K(storyItem2.media.document, "", true, true);
                if (K2 != null) {
                    try {
                        if (K2.getName().lastIndexOf(".") > 0) {
                            File file = new File(K2.getParentFile(), K2.getName().substring(0, lastIndexOf) + ".temp");
                            if (file.exists() && file.length() > 0) {
                                runnable.run();
                                return null;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                if (messageMedia != null) {
                    photo = messageMedia.photo;
                } else {
                    photo = null;
                }
                if (photo != null && (arrayList = photo.sizes) != null) {
                    TLRPC.PhotoSize w9 = b8.w(arrayList, Integer.MAX_VALUE, false, null, false);
                    b8.G(d20.f15147s0);
                    File K3 = b8.K(w9, "", false, true);
                    if (K3 != null && K3.exists()) {
                        runnable.run();
                        return null;
                    }
                } else {
                    runnable.run();
                    return null;
                }
            }
            long o10 = org.telegram.messenger.o5.o(peerStories.peer);
            ?? obj = new Object();
            obj.f43242b = false;
            obj.f43241a = o10;
            obj.f43243c = e5Var;
            obj.d = new o0(19, obj, runnable);
            o0 o0Var = new o0(20, r0, obj);
            Runnable[] runnableArr = {o0Var};
            org.telegram.messenger.i0.h3(o0Var, 3000L);
            s5 s5Var = new s5(runnableArr, obj);
            obj.e = s5Var;
            s5Var.f14424z1 = true;
            s5Var.P();
            String s10 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((s5) obj.e).r0(ic.b(document), sc.e.A(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((s5) obj.e).u0(null, null, ic.i(b8.w(arrayList2, Integer.MAX_VALUE, false, null, false), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((o0) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f49574b == null) {
            u10 u10Var = new u10();
            f49574b = u10Var;
            u10Var.f30751a = true;
            u10Var.f30752b = true;
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.al, false), 0, 0);
            f49574b.f30753c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            f49574b.f30753c.setStyle(Paint.Style.STROKE);
            f49574b.f30753c.setStrokeCap(Paint.Cap.ROUND);
        }
        f49574b.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return f49574b.f30753c;
    }

    public static Drawable p() {
        if (f49582m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.b.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f49582m = new BitmapDrawable(createBitmap);
        }
        return f49582m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f49575c == null) {
            u10 u10Var = new u10();
            f49575c = u10Var;
            u10Var.f30751a = true;
            u10Var.f30752b = true;
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bl, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false), 0, 0);
            f49575c.f30753c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            f49575c.f30753c.setStyle(Paint.Style.STROKE);
            f49575c.f30753c.setStrokeCap(Paint.Cap.ROUND);
        }
        f49575c.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return f49575c.f30753c;
    }

    public static int r(e5 e5Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 > 0) {
            TLRPC.User Z1 = vp.r1(d20.f15147s0).Z1(Long.valueOf(j10));
            if (j10 == d20.i(d20.f15147s0).f15165n || Z1 == null || (tL_recentStory2 = Z1.stories_max_id) == null || tL_recentStory2.max_id <= 0 || Z1.stories_unavailable) {
                return 0;
            }
            int i11 = e5Var.f48907f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = Z1.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i11) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(-j10));
        if (L0 == null || (tL_recentStory = L0.stories_max_id) == null || tL_recentStory.max_id <= 0 || L0.stories_unavailable) {
            return 0;
        }
        int i12 = e5Var.f48907f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = L0.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i12) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(org.telegram.messenger.i0.c1().x, org.telegram.messenger.i0.c1().y) / org.telegram.messenger.i0.f16025p);
        return a1.g.i(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        u10[] u10VarArr = f49573a;
        if (u10VarArr[z10 ? 1 : 0] == null) {
            u10 u10Var = new u10();
            u10VarArr[z10 ? 1 : 0] = u10Var;
            u10Var.f30751a = true;
            u10Var.f30752b = true;
            if (z10) {
                u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yk, false), 0, 0);
            } else {
                u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), 0, 0);
            }
            u10VarArr[z10 ? 1 : 0].f30753c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            u10VarArr[z10 ? 1 : 0].f30753c.setStyle(Paint.Style.STROKE);
            u10VarArr[z10 ? 1 : 0].f30753c.setStrokeCap(Paint.Cap.ROUND);
        }
        u10VarArr[z10 ? 1 : 0].b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return u10VarArr[z10 ? 1 : 0].f30753c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String L0;
        if (z10) {
            L0 = cd.L0(2131744691, null);
        } else {
            L0 = cd.L0(2131743826, null);
        }
        if (L0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
            u7 u7Var = new u7();
            valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
            u7Var.f49530a = textView;
            u7Var.f49534n = false;
            return valueOf;
        }
        return L0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(d20.f15147s0).getCurrentTime() <= storyItem.expire_date + 86400) {
            return false;
        }
        return true;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date) {
            return true;
        }
        return false;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(ic.c(b8.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new t7(storyItem));
            return;
        }
        if (messageMedia != null) {
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.b.f(0.2f, -16777216, -1));
            imageReceiver.v0(createBitmap);
            imageReceiver.a(new t7(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, ic.i(b8.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new t7(storyItem));
        } else {
            imageReceiver.f();
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.r0(ic.c(b8.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, ic.i(b8.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
