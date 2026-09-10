package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class r7 extends FrameLayout implements org.telegram.ui.Components.uc0 {
    public final ArrayList f36243a;
    public final org.telegram.ui.Components.u81 f36244b;
    public final View f36245c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final ArrayList e;
    public yh.b f36246f;
    public final org.telegram.ui.Components.v81 h;
    public final q7[] f36247n;
    public g7 f36248r;
    public int f36249s;
    public h7 v;

    public r7(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f36243a = new ArrayList();
        this.e = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f36247n = q7VarArr;
        this.d = p2Var;
        q7VarArr[0] = new q7(LocaleController.getString(R.string.FilterChats), 0, new i7(this));
        q7VarArr[1] = new q7(LocaleController.getString(R.string.MediaTab), 1, new n7(this));
        q7VarArr[2] = new q7(LocaleController.getString(R.string.SharedFilesTab2), 2, new k7(this));
        q7VarArr[3] = new q7(LocaleController.getString(R.string.Music), 3, new p7(this));
        int i10 = 0;
        while (true) {
            q7[] q7VarArr2 = this.f36247n;
            if (i10 < q7VarArr2.length) {
                q7 q7Var = q7VarArr2[i10];
                if (q7Var != null) {
                    this.e.add(i10, q7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.v81 v81Var = new org.telegram.ui.Components.v81(getContext(), null);
                this.h = v81Var;
                v81Var.setAllowDisallowInterceptTouch(false);
                addView(v81Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.u81 n10 = v81Var.n(3, true);
                this.f36244b = n10;
                addView(n10, w7.a6.c(48.0f, -1));
                View view = new View(getContext());
                this.f36245c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17929d7, false));
                addView(view, w7.a6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                v81Var.setAdapter(new d7(this, context, p2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.a6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                imageView.setImageDrawable(i2Var);
                int i11 = org.telegram.ui.ActionBar.j6.f18308y8;
                i2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.j6.f18327z8;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f36243a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f39216b;

                    {
                        this.f39216b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f39216b.v.h1();
                                return;
                            default:
                                this.f39216b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
                o6Var.setTextSize(AndroidUtilities.dp(18.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(o6Var, w7.a6.m(1.0f, 0, -1, 18, 0, 0));
                this.f36243a.add(o6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f36243a.add(w0Var);
                w0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f39216b;

                    {
                        this.f39216b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f39216b.v.h1();
                                return;
                            default:
                                this.f39216b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(r7 r7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.vl0 vl0Var) {
        ArrayList arrayList = n7Var.e;
        PhotoViewer.t1().K2(null, r7Var.d, null);
        if (r7Var.f36248r == null) {
            r7Var.f36248r = new g7(r7Var);
        }
        r7Var.f36248r.f33028a = vl0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.t1().f2(n7Var.f35144r, arrayList.indexOf(l7Var), -1, false, r7Var.f36248r, null);
        }
    }

    public static void b(r7 r7Var, yh.a aVar, j7 j7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.p2 p2Var = r7Var.d;
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) r7Var.h.getCurrentView();
        if (j7Var.e == 2) {
            if (vl0Var.getAdapter() instanceof k7) {
                k7 k7Var = (k7) vl0Var.getAdapter();
                PhotoViewer.t1().K2(null, p2Var, null);
                if (r7Var.f36248r == null) {
                    r7Var.f36248r = new g7(r7Var);
                }
                r7Var.f36248r.f33028a = vl0Var;
                File file = aVar.f47167a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, p2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, r7Var.f36248r, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f47170f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f47170f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f47170f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f47170f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.v81 v81Var = this.h;
            if (i10 < v81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.vl0) v81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.vl0 getListView() {
        org.telegram.ui.Components.v81 v81Var = this.h;
        if (v81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.vl0) v81Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f36249s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.v81 v81Var = this.h;
            if (i11 < v81Var.getViewPages().length) {
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) v81Var.getViewPages()[i11];
                if (vl0Var != null) {
                    vl0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(yh.b bVar) {
        this.f36246f = bVar;
        c();
    }

    public void setDelegate(h7 h7Var) {
        this.v = h7Var;
    }
}
