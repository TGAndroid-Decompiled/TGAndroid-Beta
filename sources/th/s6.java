package th;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.v20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ly;
public abstract class s6 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.t5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public q6 f49438a;
    public q6 f49439b;
    public vh.p2 f49440c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f49441f;
    public final View h;
    public final org.telegram.ui.ActionBar.p6 f49442n;
    public ArrayList f49443r;
    public final Rect f49444s;
    public final RectF f49445w;
    public final Paint f49446x;
    public final org.telegram.ui.Components.t5 f49447y;

    public s6(Context context, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f49438a = null;
        this.f49439b = null;
        this.f49440c = null;
        this.e = new Matrix();
        this.f49441f = new float[2];
        this.f49444s = new Rect();
        this.f49445w = new RectF();
        Paint paint = new Paint(1);
        this.f49446x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f49442n = p6Var;
        this.f49447y = new org.telegram.ui.Components.t5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.t5(view, 0L, 360L, gr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var != null && n5Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < n5Var.T0.size(); i10++) {
                if (((v20) n5Var.T0.get(i10)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((v20) n5Var.T0.get(i10)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ly lyVar) {
        FrameLayout frameLayout;
        v6 v6Var;
        ArrayList arrayList2 = this.f49443r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f49443r.size())) {
            vh.p2 p2Var = this.f49440c;
            if (p2Var != null) {
                p2Var.e(true);
                this.f49440c = null;
            }
            int i10 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i10--;
                }
                i10++;
            }
            this.f49439b = null;
            this.D.e(true, 0.0f);
            invalidate();
            b(false);
            this.f49443r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        v6 v6Var2 = new v6(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, lyVar);
                        if (storyItem != null) {
                            v6Var2.c(storyItem.views, false);
                        }
                        w7.e6.a(v6Var2);
                        v6Var = v6Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f51440c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        jg.y0 y0Var = new jg.y0(getContext(), org.telegram.messenger.i0.f16025p);
                        y0Var.setMaxWidth(org.telegram.messenger.i0.f16026q.x);
                        y0Var.setIsVideo(true);
                        y0Var.d(d20.f15147s0, tLObject.f51440c);
                        y0Var.setText(tLObject.a());
                        y0Var.e(3, tL_mediaAreaWeather.color);
                        v6Var = new r6(getContext(), y0Var, mediaArea);
                    } else {
                        v6Var = new q6(getContext(), this.h, mediaArea);
                    }
                    v6Var.setOnClickListener(this);
                    addView(v6Var);
                    double d = mediaArea.coordinates.f20027w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, ly lyVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, lyVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        q6 q6Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            q6 q6Var2 = this.f49439b;
            if (q6Var2 != null && q6Var2.f49397s && !q6Var2.f49399x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f49447y.d(z10);
            q6 q6Var3 = this.f49439b;
            if (q6Var3 != null && q6Var3.f49399x) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d10 = this.D.d(z11);
            int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f49445w;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.t5 t5Var = ((q6) childAt).f49391a;
                        q6 q6Var4 = this.f49439b;
                        if (childAt == q6Var4 && q6Var4.f49397s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float d11 = t5Var.d(z12);
                        if (d11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (d11 * 255.0f);
                            Paint paint = this.f49446x;
                            paint.setAlpha(i12);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z11 || d10 > 0.0f) && this.f49438a != null) {
                if (this.F == null) {
                    this.F = ((e2) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f49438a.getX(), this.f49438a.getY(), this.f49438a.getX() + this.f49438a.getMeasuredWidth(), this.f49438a.getY() + this.f49438a.getMeasuredHeight());
                    q6 q6Var5 = this.f49438a;
                    if (q6Var5.f49400y) {
                        f7 = q6Var5.f49396r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.i0.T1(1.0f, f7 * 1.05f, d10);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f49438a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f49438a.f49392b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * q6Var.getMeasuredWidth());
                    } else {
                        measuredHeight = q6Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f49444s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f49438a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f49438a.getX(), this.f49438a.getY());
                    canvas2.rotate(this.f49438a.getRotation(), this.f49438a.getPivotX(), this.f49438a.getPivotY());
                    canvas2.scale(this.f49438a.getScaleX() * T1, this.f49438a.getScaleY() * T1, this.f49438a.getPivotX(), this.f49438a.getPivotY());
                    this.f49438a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof q6) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((q6) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof q6) {
                    q6 q6Var = (q6) childAt;
                    sg.v vVar = q6Var.H;
                    if (q6Var.f49398w) {
                        org.telegram.messenger.i0.r(vVar);
                        org.telegram.messenger.i0.h3(vVar, 400L);
                    }
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: th.s6.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                TL_stories.MediaArea mediaArea = q6Var.f49392b;
                int measuredWidth = q6Var.getMeasuredWidth();
                int measuredHeight = q6Var.getMeasuredHeight();
                q6Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                q6Var.setTranslationX((float) ((mediaArea.coordinates.f20028x / 100.0d) * getMeasuredWidth()));
                q6Var.setTranslationY((float) ((mediaArea.coordinates.f20029y / 100.0d) * getMeasuredHeight()));
                q6Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) childAt;
                TL_stories.MediaArea mediaArea2 = r6Var.f49413a;
                int measuredWidth2 = r6Var.getMeasuredWidth();
                int measuredHeight2 = r6Var.getMeasuredHeight();
                r6Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                r6Var.setTranslationX((float) ((mediaArea2.coordinates.f20028x / 100.0d) * getMeasuredWidth()));
                r6Var.setTranslationY((float) ((mediaArea2.coordinates.f20029y / 100.0d) * getMeasuredHeight()));
                r6Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) getChildAt(i12);
                q6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.f49392b.coordinates.f20027w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.f49392b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) getChildAt(i12);
                r6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.f49413a.coordinates.f20027w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.f49413a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vh.p2 p2Var;
        if (getChildCount() == 0 || (p2Var = this.f49440c) == null || !p2Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            vh.p2 p2Var2 = this.f49440c;
            if (p2Var2 != null) {
                p2Var2.e(true);
                this.f49440c = null;
            }
            this.f49439b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
