package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.x20;
public abstract class a6 {
    public static x20 f48258b;
    public static x20 f48259c;
    public static x20 d;
    public static Paint e;
    public static RectF f48260f;
    public static Paint f48261g;
    public static Paint h;
    public static t01 f48262i;
    public static int f48263j;
    public static BitmapDrawable f48266m;
    public static final x20[] f48257a = new x20[2];
    public static final Paint[] f48264k = new Paint[2];
    public static final int[] f48265l = new int[2];
    public static final RectF f48267n = new RectF();
    public static final androidx.emoji2.text.n f48268o = new androidx.emoji2.text.n(7);
    public static final RectF f48269p = new RectF();
    public static final Path f48270q = new Path();
    public static final Matrix f48271r = new Matrix();
    public static final PathMeasure f48272s = new PathMeasure();
    public static final Path f48273t = new Path();

    public static void a(org.telegram.ui.ActionBar.l5 l5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            a8 a8Var = new a8();
            valueOf.setSpan(a8Var, valueOf.length() - 1, valueOf.length(), 0);
            a8Var.f48281a = l5Var;
            a8Var.f48285n = true;
            l5Var.l(valueOf, false);
            return;
        }
        l5Var.l(string, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f17342id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.f6 f6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var);
        if (f48263j != v02) {
            f48263j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    e.setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    e.setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            e.setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        int i10;
        Paint[] paintArr = f48264k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.M8;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int[] iArr = f48265l;
        if (iArr[z10 ? 1 : 0] != v02) {
            iArr[z10 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        uq uqVar = new uq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            uqVar.setScale(0.8f, 0.8f);
        } else {
            uqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(uqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new uq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
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

    public static void h(long j3, Canvas canvas, ImageReceiver imageReceiver, x5 x5Var) {
        boolean z10;
        boolean I = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j3);
        if (UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j3 && I) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j3, canvas, imageReceiver, z10, x5Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, zh.x5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a6.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, zh.x5):void");
    }

    public static void j(Canvas canvas, x5 x5Var, Paint paint, boolean z10) {
        RectF rectF = f48267n;
        if (z10) {
            RectF rectF2 = f48269p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f7 = x5Var.f49051f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f7, boolean z10, float f10) {
        Canvas canvas2;
        if (f48262i == null) {
            f48262i = new t01(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f48261g == null) {
            Paint paint = new Paint(1);
            f48261g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f48260f == null) {
            f48260f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float l4 = ((f48262i.l() + lerp) + lerp) / 2.0f;
        float f11 = 0.8f * lerp2;
        float f12 = lerp2 * 0.2f;
        f48260f.set((rectF.centerX() - l4) - dp, (rectF.bottom - f11) - dp, rectF.centerX() + l4 + dp, rectF.bottom + f12 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        canvas.scale(lerp3, lerp3, f48260f.centerX(), f48260f.centerY());
        AndroidUtilities.scaleRect(f48260f, f7);
        RectF rectF2 = f48260f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f48260f.height() / 2.0f, f48261g);
        if (z10) {
            f48260f.set(rectF.centerX() - l4, rectF.bottom - f11, rectF.centerX() + l4, rectF.bottom + f12);
            RectF rectF3 = f48260f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f48260f.height() / 2.0f, h);
            t01 t01Var = f48262i;
            RectF rectF4 = f48260f;
            canvas2 = canvas;
            t01Var.c(rectF4.left + lerp, rectF4.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, x5 x5Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = f48270q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f48271r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f48272s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f48273t;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (x5Var.f49055k) {
            boolean z11 = x5Var.f49057m;
            if (!z11 && !x5Var.f49056l) {
                if (f7 < 90.0f) {
                    float f13 = x5Var.f49051f;
                    g(canvas, rectF, paint, f7, f10, (-f13) / 2.0f, f13 / 2.0f);
                    return;
                }
                float f14 = x5Var.f49051f;
                g(canvas, rectF, paint, f7, f10, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
            } else if (x5Var.f49056l) {
                float f15 = x5Var.f49051f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (z11) {
                float f16 = x5Var.f49051f;
                g(canvas, rectF, paint, f7, f10, (-f16) / 2.0f, f16 / 2.0f);
            } else {
                canvas.drawArc(rectF, f7, f10 - f7, false, paint);
            }
        } else if (x5Var.f49056l) {
            float f17 = x5Var.f49051f;
            g(canvas, rectF, paint, f7, f10, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (f7 < 90.0f) {
            g(canvas, rectF, paint, f7, f10, x5Var.f49052g, x5Var.h);
        } else {
            g(canvas, rectF, paint, f7, f10, -x5Var.f49053i, x5Var.f49054j);
        }
    }

    public static void m(android.graphics.Canvas r23, zh.i5 r24, org.telegram.messenger.ImageReceiver r25, zh.x5 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a6.m(android.graphics.Canvas, zh.i5, org.telegram.messenger.ImageReceiver, zh.x5, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static org.telegram.ui.web.a1 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && DialogObject.getPeerDialogId(peerStories.peer) != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            i5 i5Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
            int i10 = i5Var.f48502f.get(DialogObject.getPeerDialogId(peerStories.peer));
            int i11 = 0;
            while (true) {
                if (i11 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i11).f17435id > i10) {
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
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
                if (pathToAttach != null && pathToAttach.exists()) {
                    runnable.run();
                    return null;
                }
                File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
                if (pathToAttach2 != null) {
                    try {
                        if (pathToAttach2.getName().lastIndexOf(".") > 0) {
                            File file = new File(pathToAttach2.getParentFile(), pathToAttach2.getName().substring(0, lastIndexOf) + ".temp");
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
                    File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), "", false);
                    if (pathToAttach3 != null && pathToAttach3.exists()) {
                        runnable.run();
                        return null;
                    }
                } else {
                    runnable.run();
                    return null;
                }
            }
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            ?? obj = new Object();
            obj.f37856b = false;
            obj.f37855a = peerDialogId;
            obj.f37857c = i5Var;
            obj.d = new yg.q(27, obj, runnable);
            yg.q qVar = new yg.q(28, r0, obj);
            Runnable[] runnableArr = {qVar};
            AndroidUtilities.runOnUIThread(qVar, 3000L);
            w5 w5Var = new w5(runnableArr, obj);
            obj.e = w5Var;
            w5Var.setAllowLoadingOnAttachedOnly(true);
            ((w5) obj.e).onAttachedToWindow();
            String s10 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((w5) obj.e).setImage(ImageLocation.getForDocument(document), org.telegram.ui.Cells.r6.t(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((w5) obj.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((yg.q) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f48258b == null) {
            x20 x20Var = new x20();
            f48258b = x20Var;
            x20Var.f28913a = true;
            x20Var.f28914b = true;
            x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
            f48258b.f28915c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f48258b.f28915c.setStyle(Paint.Style.STROKE);
            f48258b.f28915c.setStrokeCap(Paint.Cap.ROUND);
        }
        f48258b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f48258b.f28915c;
    }

    public static Drawable p() {
        if (f48266m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f48266m = new BitmapDrawable(createBitmap);
        }
        return f48266m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f48259c == null) {
            x20 x20Var = new x20();
            f48259c = x20Var;
            x20Var.f28913a = true;
            x20Var.f28914b = true;
            x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
            f48259c.f28915c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f48259c.f28915c.setStyle(Paint.Style.STROKE);
            f48259c.f28915c.setStrokeCap(Paint.Cap.ROUND);
        }
        f48259c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f48259c.f28915c;
    }

    public static int r(i5 i5Var, long j3) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            int i11 = i5Var.f48502f.get(j3, 0);
            TLRPC.TL_recentStory tL_recentStory3 = user.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i11) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
        if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        int i12 = i5Var.f48502f.get(j3, 0);
        TLRPC.TL_recentStory tL_recentStory4 = chat.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i12) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return a4.a.k(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        x20[] x20VarArr = f48257a;
        if (x20VarArr[z10 ? 1 : 0] == null) {
            x20 x20Var = new x20();
            x20VarArr[z10 ? 1 : 0] = x20Var;
            x20Var.f28913a = true;
            x20Var.f28914b = true;
            if (z10) {
                x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
            } else {
                x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
            }
            x20VarArr[z10 ? 1 : 0].f28915c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            x20VarArr[z10 ? 1 : 0].f28915c.setStyle(Paint.Style.STROKE);
            x20VarArr[z10 ? 1 : 0].f28915c.setStrokeCap(Paint.Cap.ROUND);
        }
        x20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return x20VarArr[z10 ? 1 : 0].f28915c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            a8 a8Var = new a8();
            valueOf.setSpan(a8Var, valueOf.length() - 1, valueOf.length(), 0);
            a8Var.f48281a = textView;
            a8Var.f48285n = false;
            return valueOf;
        }
        return string;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() <= storyItem.expire_date + 86400) {
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
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, Integer.MAX_VALUE), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new z7(storyItem));
            return;
        }
        if (messageMedia != null) {
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new z7(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new z7(storyItem));
        } else {
            imageReceiver.clearImage();
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
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1000), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }
}
