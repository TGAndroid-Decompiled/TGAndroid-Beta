package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class v1 extends View implements org.telegram.ui.Cells.n9 {
    public final f70 f42555a;
    public final i4 f42556b;
    public final ImageReceiver f42557c;
    public final org.telegram.ui.Components.h9 d;
    public c3 e;
    public c3 f42558f;
    public c3 h;
    public c3 f42559n;
    public boolean f42560r;
    public int f42561s;
    public int v;
    public int f42562w;
    public int f42563x;
    public TL_iv.pageBlockEmbedPost f42564y;

    public v1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f42555a = f70Var;
        this.f42556b = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42557c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f42558f;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            arrayList.add(c3Var3);
        }
        c3 c3Var4 = this.f42559n;
        if (c3Var4 != null) {
            arrayList.add(c3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f42558f;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            c3Var3.attach(this);
        }
        c3 c3Var4 = this.f42559n;
        if (c3Var4 != null) {
            c3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f42558f;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            c3Var3.detach(this);
        }
        c3 c3Var4 = this.f42559n;
        if (c3Var4 != null) {
            c3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42564y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof y3;
            f70 f70Var = this.f42555a;
            int i12 = 0;
            if (!z10) {
                if (this.f42560r) {
                    this.f42557c.draw(canvas);
                }
                int i13 = 54;
                if (this.f42558f != null) {
                    canvas.save();
                    if (this.f42560r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f7));
                    k4.v(f70Var, canvas, this, 0);
                    this.f42558f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f42560r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    k4.v(f70Var, canvas, this, i10);
                    this.e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f42563x;
                if (this.f42564y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, k4.f38775r1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f42561s, this.v);
                k4.v(f70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f42559n != null) {
                canvas2.save();
                canvas2.translate(this.f42561s, this.v + this.f42562w);
                k4.v(f70Var, canvas2, this, i12);
                this.f42559n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f42558f != null) {
            sb2.append(", ");
            sb2.append(this.f42558f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f42559n != null) {
            sb2.append(", ");
            sb2.append(this.f42559n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f7;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42564y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof y3;
            i4 i4Var = this.f42556b;
            int i16 = 0;
            if (z11) {
                this.f42561s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f42564y;
                c3 q6 = k4.q(this.f42555a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f42556b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f42562w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f42564y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (i4Var.G) {
                    alignment2 = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                c3 p5 = k4.p(this.f42555a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f42556b);
                this.f42559n = p5;
                if (p5 != null) {
                    i16 += this.f42559n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42560r = z10;
                if (z10) {
                    TLRPC.Photo e = g4.e(i4Var.E, j10);
                    boolean z12 = e instanceof TLRPC.TL_photo;
                    this.f42560r = z12;
                    if (z12) {
                        String str = this.f42564y.author;
                        org.telegram.ui.Components.h9 h9Var = this.d;
                        h9Var.n(0L, str, null);
                        this.f42557c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.dp(40.0f), true), e), "40_40", h9Var, 0L, (String) null, i4Var.E, 1);
                    }
                }
                String str2 = this.f42564y.author;
                if (this.f42560r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f42564y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                c3 p9 = k4.p(this.f42555a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f42556b);
                this.f42558f = p9;
                if (p9 != null) {
                    if (this.f42560r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p9.f36233s = AndroidUtilities.dp(i14 + 32);
                    c3 c3Var = this.f42558f;
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    c3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f42564y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f42564y.date * 1000);
                    if (this.f42560r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.e = k4.q(this.f42555a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f42564y, this.f42556b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f42564y.blocks.isEmpty()) {
                    this.f42561s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f42564y;
                    c3 q10 = k4.q(this.f42555a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f42556b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f42562w = height2;
                        dp3 = org.telegram.messenger.v0.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f42564y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (i4Var.G) {
                        alignment = org.telegram.ui.Components.ix0.a();
                    } else {
                        alignment = alignment3;
                    }
                    c3 p10 = k4.p(this.f42555a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f42556b);
                    this.f42559n = p10;
                    if (p10 != null) {
                        dp3 = this.f42559n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f42559n = null;
                }
                c3 c3Var2 = this.e;
                if (c3Var2 != null) {
                    if (this.f42560r) {
                        i16 = 54;
                    }
                    c3Var2.f36233s = AndroidUtilities.dp(i16 + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                c3 c3Var3 = this.h;
                if (c3Var3 != null) {
                    c3Var3.f36233s = this.f42561s;
                    c3Var3.v = this.v;
                }
                c3 c3Var4 = this.f42559n;
                if (c3Var4 != null) {
                    c3Var4.f36233s = this.f42561s;
                    c3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f42563x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f42555a, this.f42556b, motionEvent, this, this.h, this.f42561s, this.v)) {
            if (!k4.l(this.f42555a, this.f42556b, motionEvent, this, this.f42559n, this.f42561s, this.v + this.f42562w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f42564y = pageblockembedpost;
        requestLayout();
    }
}
