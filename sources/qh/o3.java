package qh;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import g7.v6;
import j$.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
public final class o3 extends i51 {
    public static final ArrayList f46559o4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public long B3;
    public float C3;
    public float D3;
    public boolean E3;
    public b2 F3;
    public int G3;
    public d1 H3;
    public final h I3;
    public ArrayList J3;
    public int K3;
    public int L3;
    public int M3;
    public boolean N3;
    public a O3;
    public boolean P3;
    public final g3 Q3;
    public final l2 R3;
    public final h3 S3;
    public final i3 T3;
    public final j3 U3;
    public final IdentityHashMap V3;
    public final IdentityHashMap W3;
    public a X3;
    public a Y3;
    public final k3 Z3;
    public final t2 f46560a4;
    public final int f46561b3;
    public final u2 f46562b4;
    public final b6 f46563c3;
    public final v2 f46564c4;
    public final m3 f46565d3;
    public final w2 f46566d4;
    public MessageObject f46567e3;
    public f5 f46568e4;
    public boolean f46569f3;
    public x60 f46570f4;
    public TL_iv.RichMessage f46571g3;
    public int f46572g4;
    public final ArrayList f46573h3;
    public int f46574h4;
    public final HashMap f46575i3;
    public final m2 f46576i4;
    public final c3 f46577j3;
    public final x2 f46578j4;
    public final z9 f46579k3;
    public final n2.p f46580k4;
    public int f46581l3;
    public final ArrayList f46582l4;
    public int f46583m3;
    public dl0 f46584m4;
    public int f46585n3;
    public int f46586n4;
    public boolean f46587o3;
    public float f46588p3;
    public float f46589q3;
    public float f46590r3;
    public float f46591s3;
    public View f46592t3;
    public b f46593u3;
    public boolean f46594v3;
    public boolean f46595w3;
    public boolean f46596x3;
    public boolean f46597y3;
    public TL_iv.pageTableCell f46598z3;

    public o3(Context context, int i9, b6 b6Var, m3 m3Var) {
        super(context, i9, 0, false, new b8(r1, 28), new kh.p(r1, 23), null, b6Var);
        this.f46569f3 = true;
        this.f46573h3 = new ArrayList();
        this.f46575i3 = new HashMap();
        this.f46581l3 = -1;
        this.f46583m3 = -1;
        this.f46585n3 = 0;
        this.I3 = new h(this, 2);
        this.N3 = true;
        this.Q3 = new g3(this);
        this.R3 = new l2(this);
        this.S3 = new h3(this);
        this.T3 = new i3(this);
        this.U3 = new j3(this);
        this.V3 = new IdentityHashMap();
        this.W3 = new IdentityHashMap();
        this.Z3 = new k3(this);
        this.f46560a4 = new t2(this);
        this.f46562b4 = new u2(this);
        this.f46564c4 = new v2(this);
        this.f46566d4 = new w2(this);
        this.f46572g4 = -1;
        this.f46574h4 = -1;
        this.f46576i4 = new m2(this);
        this.f46578j4 = new x2(this);
        n2.p pVar = new n2.p(this, 17);
        this.f46580k4 = pVar;
        this.f46582l4 = new ArrayList();
        this.f46586n4 = -1;
        o3[] o3VarArr = {this};
        this.f46561b3 = i9;
        this.f46563c3 = b6Var;
        this.f46565d3 = m3Var;
        this.U2.f35188r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new b8(this, 29), false);
        setReorderLongPressEnabled(false);
        w1(true);
        c3 c3Var = new c3(this, m3Var);
        this.f46577j3 = c3Var;
        c3Var.T(this);
        c3Var.E0 = this.T2;
        z9 o6 = c3Var.o(context);
        this.f46579k3 = o6;
        AndroidUtilities.removeFromParent(o6);
        c3Var.D = new e3(this, m3Var);
        j(new eh.n(9, this, m3Var));
        this.F3 = new b2(pVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!E3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !B3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean F3(a aVar) {
        if (aVar != null && !aVar.f46274i && !x3(aVar) && (aVar.f46269b instanceof TL_iv.pageBlockParagraph) && aVar.f46270c == 0 && aVar.d == 0 && !aVar.f46271e && aVar.f46276k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void I1(qh.o3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.z41 r22) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.I1(qh.o3[], java.util.ArrayList, org.telegram.ui.Components.z41):void");
    }

    public static void J2(ArrayList arrayList, a aVar) {
        int i9;
        int i10;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f46269b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f46273g;
            if (sVar != null && sVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f46269b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f46269b.caption.text = new TL_iv.textEmpty();
                        aVar.f46269b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f46269b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f46273g;
            if (sVar2 != null && sVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f46269b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f46269b.caption.text = new TL_iv.textEmpty();
                        aVar.f46269b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f46269b);
                }
            }
        } else if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.f46269b);
            List Q3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i11 = 0; g32 != null && i11 < g32.size() && i11 < Q3.size(); i11++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) g32.get(i11);
                if (((s) Q3.get(i11)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        h0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f46269b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f46269b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f46269b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                h0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f46269b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                s sVar3 = aVar.f46273g;
                if (sVar3 != null && sVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f46269b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f46269b.caption.text = new TL_iv.textEmpty();
                            aVar.f46269b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f46269b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                s sVar4 = aVar.f46273g;
                if (sVar4 != null && (document = sVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f22386id;
                }
                if (sVar4 != null && sVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f46269b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        h0.d(pageBlock7);
                        arrayList.add(aVar.f46269b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i12 = f4.I;
                if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                    if (pageblockmap.caption == null) {
                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                        pageblockmap.caption = pageCaption;
                        pageCaption.text = new TL_iv.textEmpty();
                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(pageblockmap);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMath) {
                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                    arrayList.add(aVar.f46269b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i13 = 0; i13 < pageblocktable.rows.size(); i13++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i13);
                        if (pagetablerow.cells != null) {
                            for (int i14 = 0; i14 < pagetablerow.cells.size(); i14++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i14);
                                if (pagetablecell.text == null) {
                                    w5.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i9 = pagetablecell.flags | 2;
                                } else {
                                    i9 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i9;
                                if (pagetablecell.rowspan > 1) {
                                    i10 = pagetablecell.flags | 4;
                                } else {
                                    i10 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i10;
                            }
                        }
                    }
                }
                if (O4(pageblocktable)) {
                    arrayList.add(pageblocktable);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
                ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList.add(pageblockbuttonrow);
                }
            } else {
                arrayList.add(pageBlock5);
            }
        }
    }

    public static void K1(o3 o3Var, int i9, int i10, int i11) {
        d1 editText;
        if (i9 >= 0) {
            View m10 = o3Var.T2.m(i9);
            if (m10 instanceof s5) {
                s5 s5Var = (s5) m10;
                if (i10 == 1 && s5Var.n()) {
                    editText = s5Var.getAuthorEditText();
                } else {
                    editText = s5Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i11, editText.length())));
            } else if (m10 instanceof f5) {
                f5 f5Var = (f5) m10;
                d1 l10 = f5Var.l(i10);
                if (l10 == null) {
                    l10 = f5Var.l(0);
                }
                if (l10 != null) {
                    l10.s();
                    l10.setSelection(Math.max(0, Math.min(i11, l10.length())));
                }
            } else if (m10 instanceof i0) {
                d1 captionEditText = ((i0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i11, captionEditText.length())));
            }
        }
    }

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock L1(qh.o3 r2, qh.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.L1(qh.o3, qh.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
        }
    }

    public static void M1(o3 o3Var, d1 d1Var) {
        if (d1Var == null) {
            o3Var.getClass();
            return;
        }
        d1Var.adaptiveCreateLinkDialog = o3Var.f46569f3;
        d1Var.setInlineButtonContext(o3Var.f46561b3);
        d1Var.setInlineButtonClickListener(new m2(o3Var));
    }

    public static void N1(a aVar, s sVar, o3 o3Var) {
        m3 m3Var = o3Var.f46565d3;
        IdentityHashMap identityHashMap = o3Var.W3;
        IdentityHashMap identityHashMap2 = o3Var.V3;
        if (sVar == null) {
            ArrayList arrayList = o3Var.f46573h3;
            for (s sVar2 : Q3(aVar)) {
                r4 r4Var = (r4) identityHashMap2.remove(sVar2);
                if (r4Var != null) {
                    r4Var.b();
                }
                n4 n4Var = (n4) identityHashMap.remove(sVar2);
                if (n4Var != null) {
                    n4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                b2 b2Var = o3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                arrayList.remove(indexOf);
                o3Var.U2.N(true);
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
            }
            m3Var.onContentChanged();
            return;
        }
        r4 r4Var2 = (r4) identityHashMap2.remove(sVar);
        if (r4Var2 != null) {
            r4Var2.b();
        }
        n4 n4Var2 = (n4) identityHashMap.remove(sVar);
        if (n4Var2 != null) {
            n4Var2.a();
        }
        b2 b2Var3 = o3Var.F3;
        if (b2Var3 != null) {
            b2Var3.d();
        }
        o3Var.q4(aVar, sVar);
        b2 b2Var4 = o3Var.F3;
        if (b2Var4 != null) {
            b2Var4.h();
        }
        m3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i9, boolean z10, int i10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i11);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i9, i10, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i9, i10);
                            aVar.f46271e = z11;
                            aVar.f46272f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i9, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        S1(arrayList, null, i9, i10, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i9 + 1);
                }
            }
        }
        if (!z13) {
            S1(arrayList, null, i9, i10, z11, z12);
        }
    }

    public static TL_iv.PageBlock N3(a aVar, s sVar) {
        int i9;
        if (B3(aVar.f46269b)) {
            ArrayList g32 = g3(aVar.f46269b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i9 = arrayList.indexOf(sVar);
            } else {
                i9 = -1;
            }
            if (i9 >= 0 && g32 != null && i9 < g32.size()) {
                return (TL_iv.PageBlock) g32.get(i9);
            }
            return null;
        }
        return aVar.f46269b;
    }

    public static void O1(o3 o3Var) {
        if (o3Var.E3) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        o3Var.f46565d3.h0();
        o3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i9) {
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i11 = 1;
            while (i10 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i10);
                i10++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i9, i11, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i12 = i11;
                    N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i9, true, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i11 = i12;
                }
                i11++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i10);
            i10++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i9, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i9, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(u5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i9 = 0; i9 < pageblocktable.rows.size(); i9++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i9);
            for (int i10 = 0; i10 < pagetablerow.cells.size(); i10++) {
                if (!w5.g(pagetablerow.cells.get(i10)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(o3 o3Var, a aVar) {
        ArrayList arrayList = o3Var.f46573h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f46276k.addAll(aVar.f46276k);
        arrayList.add(indexOf + 1, aVar2);
        o3Var.s4();
        o3Var.U2.N(false);
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.post(new i2(o3Var, aVar2, 23));
    }

    public static FrameLayout P4(f5 f5Var, boolean z10) {
        int i9;
        i5 m10;
        w5 model = f5Var.getModel();
        if (model != null) {
            int i10 = Integer.MAX_VALUE;
            if (z10) {
                i9 = -1;
            } else {
                i9 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : f5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o6 = z10 ? (w5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o6 < i9 || (o6 == i9 && a2 < i10) : o6 > i9 || (o6 == i9 && a2 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a2;
                    i9 = o6;
                }
            }
            if (pagetablecell != null && (m10 = f5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return f5Var;
    }

    public static boolean Q1(qh.o3 r16, qh.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.Q1(qh.o3, qh.a, boolean):boolean");
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.f46269b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        s sVar = aVar.f46273g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static d1 R3(View view) {
        if (view instanceof s5) {
            return ((s5) view).getEditText();
        }
        if (view instanceof i0) {
            return ((i0) view).getCaptionEditText();
        }
        if (view instanceof q0) {
            return ((q0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i9, int i10, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i9, i10);
        aVar.f46271e = z10;
        aVar.f46272f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            return pageblockpreformatted;
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return new TL_iv.pageBlockFooter();
        } else {
            return new TL_iv.pageBlockParagraph();
        }
    }

    public static s T3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i9;
        s sVar = new s();
        sVar.f46669b = photoEntry.isVideo;
        sVar.f46671e = str;
        sVar.f46675j = photoEntry.width;
        sVar.f46676k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i10 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = photoEntry.orientation;
        }
        sVar.f46677l = i9;
        if (!z10) {
            i10 = photoEntry.invert;
        }
        sVar.f46678m = i10;
        sVar.f46668a = 1;
        sVar.f46672f = 0.0f;
        return sVar;
    }

    public static f5 U2(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof f5) {
                return (f5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new a(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        W2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f46274i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = m0.a();
                        W2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f46276k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    O2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(f5 f5Var) {
        int i9;
        int i10;
        w5 w5Var = f5Var.B;
        if (w5Var != null) {
            i9 = w5Var.f46783g.size();
        } else {
            i9 = 0;
        }
        while (i9 >= 0) {
            d1 l10 = f5Var.l(i9);
            if (l10 != null) {
                i10 = l10.length();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return new int[]{i9, i10};
            }
            i9--;
        }
        return null;
    }

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(d1 d1Var, float f10, float f11) {
        if (d1Var != null && d1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            d1Var.getLocationOnScreen(iArr);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= d1Var.getWidth() && f13 <= d1Var.getHeight()) {
                int offsetForPosition = d1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                d1Var.s();
                d1Var.setSelection(Math.max(0, Math.min(offsetForPosition, d1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int k4(int i9, a aVar, boolean z10) {
        int i10;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i10 = aVar.f46277l;
        } else {
            i10 = aVar.f46278m;
        }
        int size = aVar.f46276k.size() - i10;
        return org.telegram.messenger.l0.D(16.0f, Math.max(0, i9 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !D3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f46276k;
        int i9 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f46276k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i9 < min && ((Long) arrayList.get(i9)).equals(arrayList2.get(i9))) {
            i9++;
        }
        return i9;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                ((s5) childAt).setLocked(z10);
            } else if (childAt instanceof f5) {
                ((f5) childAt).setLocked(z10);
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof q0) {
                ((q0) childAt).setLocked(z10);
            } else if (childAt instanceof u0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i9) {
        if (i9 != 21 && i9 != 22 && i9 != 19 && i9 != 20) {
            return false;
        }
        return true;
    }

    public static int w2(int i9) {
        if (i9 == 4) {
            return 114971;
        }
        if (i9 == 16384) {
            return 32772;
        }
        if (i9 != 32768) {
            return 4;
        }
        return 16388;
    }

    public static boolean x3(a aVar) {
        if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !s5.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean A1() {
        return this.P3;
    }

    public final ArrayList A2(int i9, int i10) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i9 <= i10) {
            ArrayList arrayList2 = this.f46573h3;
            if (i9 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i9))) {
                if (sVar.b() && (photo = sVar.f46673g) != null && hashSet.add(Long.valueOf(photo.f22404id))) {
                    arrayList.add(sVar.f46673g);
                }
            }
            i9++;
        }
        return arrayList;
    }

    public final View A4(int i9) {
        if (i9 < 0) {
            return null;
        }
        return this.T2.m(i9);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f46573h3;
            if (i9 < arrayList2.size()) {
                for (s sVar : Q3((a) arrayList2.get(i9))) {
                    if (sVar.b() && (photo = sVar.f46673g) != null && hashSet.add(Long.valueOf(photo.f22404id))) {
                        arrayList.add(sVar.f46673g);
                    }
                }
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] B4() {
        int i9;
        ArrayList arrayList = this.f46573h3;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            int indexOf = arrayList.indexOf(y4(c3Var.f24774u0));
            int indexOf2 = arrayList.indexOf(y4(c3Var.f24777x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a Q2 = Q2();
        if (Q2 != null) {
            i9 = arrayList.indexOf(Q2);
        } else {
            i9 = -1;
        }
        if (i9 >= 0) {
            return new int[]{i9, i9};
        }
        return null;
    }

    @Override
    public final void C1() {
        m3 m3Var = this.f46565d3;
        if (m3Var != null) {
            m3Var.V0();
        }
    }

    public final void C2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.h();
        }
        ArrayList arrayList = this.f46573h3;
        SpannableStringBuilder k10 = t4.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.f46575i3;
        hashMap.clear();
        this.f46571g3 = null;
        W2(arrayList, t4.b(k10), hashMap);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        m3 m3Var = this.f46565d3;
        if (m3Var != null) {
            m3Var.onContentChanged();
            m3Var.N1();
        }
    }

    public final boolean C4() {
        int i9;
        int i10;
        int i11;
        int i12;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            if (L3()) {
                int i13 = c3Var.f24774u0;
                int i14 = c3Var.f24775v0;
                int i15 = c3Var.f24778y0;
                int i16 = c3Var.f24776w0;
                int i17 = c3Var.f24779z0;
                for (int i18 = i14; i18 <= i15; i18++) {
                    d1 N4 = N4(i13, i18);
                    if (N4 != null) {
                        int length = N4.length();
                        if (i18 == i14) {
                            i11 = i16;
                        } else {
                            i11 = 0;
                        }
                        if (i18 == i15) {
                            i12 = i17;
                        } else {
                            i12 = length;
                        }
                        if (i14 == i15) {
                            i11 = Math.min(i16, i17);
                            i12 = Math.max(i16, i17);
                        }
                        if (Math.max(0, Math.min(i11, length)) < Math.max(0, Math.min(i12, length))) {
                            return true;
                        }
                    }
                }
            } else if (y3()) {
                d1 I2 = I2(c3Var.f24774u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(c3Var.f24776w0, c3Var.f24779z0), I2.length())) < Math.max(0, Math.min(Math.max(c3Var.f24776w0, c3Var.f24779z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                d1 s22 = s2(c3Var.f24774u0);
                if (s22 != null) {
                    int i19 = c3Var.f24776w0;
                    int i20 = c3Var.f24779z0;
                    if (Math.max(0, Math.min(Math.min(i19, i20), s22.length())) < Math.max(0, Math.min(Math.max(i19, i20), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                d1 j42 = j4(c3Var.f24774u0);
                if (j42 != null) {
                    int i21 = c3Var.f24776w0;
                    int i22 = c3Var.f24779z0;
                    if (Math.max(0, Math.min(Math.min(i21, i22), j42.length())) < Math.max(0, Math.min(Math.max(i21, i22), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i23 = c3Var.f24774u0;
                int i24 = c3Var.f24777x0;
                int i25 = c3Var.f24776w0;
                int i26 = c3Var.f24779z0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.f46582l4.size()) {
                    for (int i27 = i23; i27 <= i24; i27++) {
                        a y42 = y4(i27);
                        if (y42 != null) {
                            if (y42.f46285t == 0) {
                                TL_iv.PageBlock pageBlock = y42.f46269b;
                                if (!A3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int i28 = i2(i27);
                            if (i27 == i23) {
                                i9 = i25;
                            } else {
                                i9 = 0;
                            }
                            if (i27 == i24) {
                                i10 = i26;
                            } else {
                                i10 = i28;
                            }
                            if (Math.max(0, Math.min(i9, i28)) < Math.max(0, Math.min(i10, i28))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void D1() {
        m3 m3Var = this.f46565d3;
        if (m3Var != null) {
            m3Var.v1();
        }
        x4();
    }

    public final a D2() {
        int i9;
        a y42;
        a Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        c3 c3Var = this.f46577j3;
        if (c3Var != null && (i9 = c3Var.f24774u0) >= 0 && (y42 = y4(i9)) != null) {
            return y42;
        }
        return null;
    }

    public final int[] D4() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24777x0;
            if (i9 >= 0 && i10 >= 0) {
                a y42 = y4(i9);
                a y43 = y4(i10);
                if (y42 != null && y43 != null) {
                    ArrayList arrayList = this.f46573h3;
                    int indexOf = arrayList.indexOf(y42);
                    int indexOf2 = arrayList.indexOf(y43);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        if (indexOf > indexOf2) {
                            indexOf = indexOf2;
                            indexOf2 = indexOf;
                        }
                        return new int[]{indexOf, indexOf2};
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void E1(f2.q1 q1Var) {
        m3 m3Var = this.f46565d3;
        if (m3Var != null && q1Var != null) {
            View view = q1Var.f5501a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.P3 = m3Var.n(view.getHeight() + iArr[1]);
        }
    }

    public final void E2() {
        ArrayList arrayList;
        c3 c3Var = this.f46577j3;
        int i9 = c3Var.f24774u0;
        int i10 = c3Var.f24776w0;
        int i11 = c3Var.f24777x0;
        if (!W1(i9, i10, i11, c3Var.f24779z0, new String[]{""})) {
            if (i9 > i11) {
                i11 = i9;
                i9 = i11;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i9);
            while (true) {
                arrayList = this.f46573h3;
                if (max > i11) {
                    break;
                }
                ArrayList arrayList3 = this.f46582l4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f46285t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f46575i3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        hashSet.addAll(((a) arrayList.get(i12)).f46276k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                x2();
                V3();
                s4();
                c3Var.f(false);
                this.U2.N(false);
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                post(new i2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void E4(d1 d1Var) {
        d1Var.adaptiveCreateLinkDialog = this.f46569f3;
        d1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void F1(f2.q1 q1Var) {
        a aVar = this.O3;
        this.O3 = null;
        this.P3 = false;
        if (aVar != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            r4(aVar);
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            m3 m3Var = this.f46565d3;
            if (m3Var != null) {
                m3Var.onContentChanged();
            }
        } else if (q1Var != null) {
            View view = q1Var.f5501a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean F2() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            c3Var.f(false);
            return true;
        } else if (this.f46568e4 == null) {
            return false;
        } else {
            M2();
            return true;
        }
    }

    public final void F4(qh.f5 r33) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.F4(qh.f5):void");
    }

    @Override
    public final void G1(f2.q1 q1Var) {
        int b10;
        l41 G;
        a aVar = null;
        if (q1Var != null && (b10 = q1Var.b()) >= 0 && (G = this.U2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.O3 = aVar;
        this.P3 = false;
        m3 m3Var = this.f46565d3;
        if (m3Var != null) {
            m3Var.C0();
        }
    }

    public final void G2() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null) {
            c3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.V3;
        for (r4 r4Var : identityHashMap.values()) {
            r4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.W3;
        for (n4 n4Var : identityHashMap2.values()) {
            n4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i9;
        a y42;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y() && (i9 = c3Var.f24774u0) == c3Var.f24777x0 && i9 >= 0 && i9 < this.f46582l4.size() && c3Var.f24775v0 == 1 && c3Var.f24778y0 == 1 && (y42 = y4(i9)) != null && s5.p(y42.f46269b)) {
            return true;
        }
        return false;
    }

    public final s5 G4() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24777x0;
            a y42 = y4(i9);
            if (i9 == i10 && y42 != null && A3(y42.f46269b)) {
                return u2(i9);
            }
            return null;
        }
        return null;
    }

    public final int H2(int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            ArrayList arrayList = this.f46573h3;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i11))) {
                i10++;
            } else if (((a) arrayList.get(i11)).f46274i) {
                i10--;
            }
        }
        return i10;
    }

    public final boolean H3(int i9, int i10) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f46573h3;
            if (i10 < arrayList.size() && i9 <= i10) {
                boolean z10 = false;
                while (i9 <= i10) {
                    a aVar = (a) arrayList.get(i9);
                    if (!aVar.f46274i && !x3(aVar)) {
                        if (!aVar.f46276k.isEmpty() || s5.p(aVar.f46269b)) {
                            z10 = true;
                        }
                    }
                    i9++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable H4(int i9, int i10, int i11, int i12) {
        if (i9 == i11) {
            if (x3(y4(i9))) {
                d1 I2 = I2(i9);
                if (I2 != null) {
                    return I2.getText();
                }
                return null;
            } else if (G3()) {
                d1 j42 = j4(i9);
                if (j42 != null) {
                    return j42.getText();
                }
                return null;
            } else {
                a y42 = y4(i9);
                if (y42 != null && A3(y42.f46269b)) {
                    int i22 = i2(i9);
                    if (org.telegram.ui.Cells.j2.w(i10, i12, i22, 0) < org.telegram.ui.Cells.j2.d(i10, i12, i22, 0)) {
                        s5 u22 = u2(i9);
                        if (u22 != null) {
                            return u22.getEditText().getText();
                        }
                        return s5.A(y42.f46269b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final d1 I2(int i9) {
        if (!x3(y4(i9))) {
            return null;
        }
        View A4 = A4(i9);
        if (!(A4 instanceof q0)) {
            return null;
        }
        return ((q0) A4).getEditText();
    }

    public final boolean I3() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24777x0;
            if (i9 >= 0 && i10 >= 0 && i10 >= i9) {
                boolean z10 = false;
                while (i9 <= i10) {
                    a y42 = y4(i9);
                    if (y42 != null) {
                        if (C3(y42.f46269b)) {
                            z10 = true;
                        }
                    }
                    i9++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean I4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.I4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean J3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.J3(int, int, int, int, int):boolean");
    }

    public final void J4(View view) {
        f2.q1 T;
        int b10;
        if (view != null && this.V2 != null && this.Y2 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.U2.H(b10) >= 0) {
            this.f46595w3 = true;
            c3 c3Var = this.f46577j3;
            if (c3Var.y()) {
                c3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.V2.r(T);
        }
    }

    public final boolean K3(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z10 = false;
        for (int i17 = i11; i17 <= i13; i17++) {
            d1 N4 = N4(i10, i17);
            if (N4 != null) {
                int length = N4.length();
                if (i17 == i11) {
                    i15 = i12;
                } else {
                    i15 = 0;
                }
                if (i17 == i13) {
                    i16 = i14;
                } else {
                    i16 = length;
                }
                if (i11 == i13) {
                    i15 = Math.min(i12, i14);
                    i16 = Math.max(i12, i14);
                }
                int max = Math.max(0, Math.min(i15, length));
                int max2 = Math.max(0, Math.min(i16, length));
                if (max >= max2) {
                    continue;
                } else if ((N4.getCurrentStyle(max, max2) & i9) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void K4(a aVar, s sVar, MediaController.PhotoEntry photoEntry) {
        int i9;
        float f10;
        r4 r4Var = (r4) this.V3.remove(sVar);
        if (r4Var != null) {
            r4Var.b();
        }
        IdentityHashMap identityHashMap = this.W3;
        n4 n4Var = (n4) identityHashMap.remove(sVar);
        if (n4Var != null) {
            n4Var.a();
        }
        sVar.f46668a = 1;
        sVar.f46672f = 0.0f;
        n4 n4Var2 = new n4(this.f46561b3, photoEntry, new a3(aVar, sVar, this));
        identityHashMap.put(sVar, n4Var2);
        if (!n4Var2.f46546f && !n4Var2.h && !n4Var2.f46547n) {
            n4Var2.f46546f = true;
            int i10 = photoEntry.width;
            int i11 = photoEntry.height;
            if (i10 <= 0 || i11 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(photoEntry.path, options);
                    i10 = options.outWidth;
                    i11 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            VideoEditedInfo videoEditedInfo = null;
            r7 = null;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
            videoEditedInfo = null;
            if (i10 > 0 && i11 > 0) {
                int i12 = photoEntry.orientation;
                if (i12 == 90 || i12 == 270) {
                    int i13 = i11;
                    i11 = i10;
                    i10 = i13;
                }
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = (float) 0;
                videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
                while (true) {
                    long j10 = videoEditedInfo2.endTime;
                    i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i9 <= 0 || j10 >= 1000) {
                        break;
                    }
                    videoEditedInfo2.endTime = j10 * 2;
                }
                if (i9 <= 0) {
                    videoEditedInfo2.endTime = 3000L;
                }
                long j11 = videoEditedInfo2.endTime;
                videoEditedInfo2.end = (float) j11;
                videoEditedInfo2.compressQuality = 1;
                videoEditedInfo2.rotationValue = 0;
                videoEditedInfo2.originalPath = photoEntry.path;
                videoEditedInfo2.estimatedSize = (int) ((f10 / 1000.0f) * 115200.0f);
                videoEditedInfo2.estimatedDuration = j11;
                videoEditedInfo2.framerate = 30;
                videoEditedInfo2.originalDuration = j11;
                videoEditedInfo2.filterState = photoEntry.savedFilterState;
                String str = photoEntry.croppedPaintPath;
                if (str != null) {
                    videoEditedInfo2.paintPath = str;
                    ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = photoEntry.croppedMediaEntities;
                    }
                    videoEditedInfo2.mediaEntities = arrayList;
                } else {
                    videoEditedInfo2.paintPath = photoEntry.paintPath;
                    videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
                }
                videoEditedInfo2.isPhoto = true;
                MediaController.CropState cropState = photoEntry.cropState;
                if (cropState != null) {
                    int i14 = cropState.transformRotation;
                    if (i14 == 90 || i14 == 270) {
                        int i15 = i11;
                        i11 = i10;
                        i10 = i15;
                    }
                    i10 = (int) (i10 * cropState.cropPw);
                    i11 = (int) (i11 * cropState.cropPh);
                }
                float f11 = i10;
                float f12 = i11;
                float max = Math.max(f11 / 854.0f, f12 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i16 = (int) (f11 / max);
                int i17 = (int) (f12 / max);
                if (i16 % 16 != 0) {
                    i16 = Math.max(1, Math.round(i16 / 16.0f)) * 16;
                }
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                videoEditedInfo2.resultWidth = i16;
                videoEditedInfo2.originalWidth = i16;
                videoEditedInfo2.resultHeight = i17;
                videoEditedInfo2.originalHeight = i17;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.avatarStartTime = 0L;
                videoEditedInfo = videoEditedInfo2;
            }
            n4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22401id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                n4Var2.f46545e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(n4Var2.f46542a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                n4Var2.f46544c = messageObject;
                messageObject.videoEditedInfo = n4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(n4Var2.f46542a);
                notificationCenter.addObserver(n4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(n4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(n4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(n4Var2.f46544c, false, false, false);
                return;
            }
            n4Var2.b();
        }
    }

    public final boolean L3() {
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24777x0;
            a y42 = y4(i9);
            if (i9 == i10 && y42 != null && (y42.f46269b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L4(a aVar, s sVar, String str, boolean z10, int i9, int i10, int i11) {
        IdentityHashMap identityHashMap = this.V3;
        r4 r4Var = (r4) identityHashMap.remove(sVar);
        if (r4Var != null) {
            r4Var.b();
        }
        r4 r4Var2 = new r4(this.f46561b3, str, z10, i9, i10, i11, new b3(aVar, sVar, this));
        identityHashMap.put(sVar, r4Var2);
        r4Var2.d();
    }

    public final void M2() {
        if (this.f46596x3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f46596x3 = false;
        this.f46597y3 = false;
        this.f46598z3 = null;
        this.A3 = null;
        x60 x60Var = this.f46570f4;
        if (x60Var != null) {
            this.f46570f4 = null;
            x60Var.u();
        }
        f5 f5Var = this.f46568e4;
        if (f5Var != null) {
            LinkedHashSet linkedHashSet = f5Var.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                f5Var.v.invalidate();
                f5Var.t();
            }
            this.f46568e4 = null;
        }
        this.f46574h4 = -1;
        this.f46572g4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f46561b3).config;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46573h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            i10 += Q3((a) arrayList.get(i9)).size();
            i9++;
        }
        ArrayList Z2 = Z2();
        ?? obj = new Object();
        obj.d = i10;
        obj.f46329b = Z2.size() + obj.f46329b;
        for (int i11 = 0; i11 < Z2.size(); i11++) {
            c2.b((TL_iv.PageBlock) Z2.get(i11), 1, obj);
        }
        if (obj.f46328a > appGlobalConfig.richMessageLengthLimit.get() || obj.f46329b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f46330c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.f46331e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            return ((s5) z12).getEditText().getText();
        }
        return s5.A(aVar.f46269b);
    }

    public final d1 N4(int i9, int i10) {
        View A4 = A4(i9);
        if (!(A4 instanceof f5)) {
            return null;
        }
        return ((f5) A4).l(i10);
    }

    public final int[] O3(int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.J3.size(); i11++) {
            int length = s5.z(((a) this.J3.get(i11)).f46269b).length();
            if (i9 <= i10 + length) {
                return new int[]{i11, i9 - i10};
            }
            i10 += length + 1;
        }
        int size = this.J3.size() - 1;
        return new int[]{size, s5.z(((a) this.J3.get(size)).f46269b).length()};
    }

    public final d1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                return ((s5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i9) {
        int i10 = 1;
        int i11 = i9 + 1;
        while (true) {
            ArrayList arrayList = this.f46573h3;
            if (i11 < arrayList.size()) {
                a aVar = (a) arrayList.get(i11);
                if (x3(aVar)) {
                    i10++;
                } else if (aVar.f46274i && i10 - 1 == 0) {
                    return i11;
                }
                i11++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a Q2() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                if (s5Var.getEditText().isFocused() || (s5Var.n() && s5Var.h.isFocused())) {
                    return s5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        boolean z10;
        int[] B4 = B4();
        if (B4 != null) {
            int i9 = B4[0];
            int i10 = B4[1];
            if (i9 >= 0) {
                ArrayList arrayList = this.f46573h3;
                if (i10 < arrayList.size() && i9 <= i10) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (H3(i9, i10)) {
                        for (int i11 = i9; i11 <= i10; i11++) {
                            a aVar = (a) arrayList.get(i11);
                            boolean z11 = aVar.f46274i;
                            ArrayList arrayList2 = aVar.f46276k;
                            if (!z11 && !x3(aVar)) {
                                if (s5.p(aVar.f46269b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f46269b.text;
                                    aVar.f46269b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    aa.d.u(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = m0.a();
                        for (int i12 = i9; i12 <= i10; i12++) {
                            a aVar2 = (a) arrayList.get(i12);
                            boolean z12 = aVar2.f46274i;
                            ArrayList arrayList3 = aVar2.f46276k;
                            if (!z12 && !x3(aVar2)) {
                                if (s5.p(aVar2.f46269b)) {
                                    long a3 = m0.a();
                                    TL_iv.RichText k10 = s5.k(aVar2.f46269b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f46575i3.put(Long.valueOf(a3), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a3));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f46269b.text;
                                    aVar2.f46269b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    x2();
                    V3();
                    s4();
                    c3 c3Var = this.f46577j3;
                    if (c3Var != null && c3Var.y()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i9, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    this.U2.N(false);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    if (z10) {
                        post(new pf.a(this, aVar3, aVar4, 9));
                    } else {
                        post(new i2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void R1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.R1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final f5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return U2((d1) findFocus);
        }
        return null;
    }

    public final void R4(qh.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.R4(qh.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document S2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        TLRPC.Document document2 = null;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f46573h3.size(); i11++) {
            for (s sVar : Q3((a) this.f46573h3.get(i11))) {
                if (sVar != null && (document = sVar.h) != null && document.f22386id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f46571g3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f22386id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = m4.f46523a;
        synchronized (m4.class) {
            if (i9 != 0) {
                document2 = (TLRPC.Document) m4.f46524b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean S4() {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.S4():boolean");
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        o3 o3Var;
        if (aVar != null && D3(aVar.f46269b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                s T3 = T3(photoEntry, str2);
                boolean c10 = n4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (B3(aVar.f46269b)) {
                    g3(aVar.f46269b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    s sVar = aVar.f46273g;
                    if (sVar != null && sVar.f46668a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f46269b.caption;
                        h0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f46269b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f46273g);
                        aVar.h.add(T3);
                        aVar.f46273g = null;
                        aVar.f46269b = pageblockcollage;
                    } else {
                        aVar.f46269b = pageblockvideo;
                        aVar.f46273g = T3;
                    }
                }
                this.U2.N(false);
                n4(aVar);
                if (c10) {
                    K4(aVar, T3, photoEntry);
                    o3Var = this;
                } else {
                    o3Var = this;
                    o3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                o3Var.f46565d3.onContentChanged();
            }
        }
    }

    public final int T2(int i9, int i10) {
        while (i9 >= 0) {
            ArrayList arrayList = this.f46573h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            if (!aVar.f46274i) {
                int i11 = 0;
                int i12 = -1;
                for (int i13 = 0; i13 < i9; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    if (x3(aVar2)) {
                        i11++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f46269b).open) {
                            i12 = i11;
                        }
                    } else if (aVar2.f46274i) {
                        if (i12 != -1 && i11 == i12) {
                            i12 = -1;
                        }
                        i11--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f46269b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i9;
                    }
                }
            }
            i9 += i10;
        }
        return -1;
    }

    public final boolean T4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.T4(android.view.View, float, float):boolean");
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f46571g3;
            if (richMessage2 == null) {
                this.f46571g3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f46571g3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            W2(arrayList4, richMessage.blocks, this.f46575i3);
            if (!arrayList4.isEmpty()) {
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    v4((a) arrayList4.get(i9));
                }
                ArrayList arrayList5 = this.f46573h3;
                int size = arrayList5.size();
                a Q2 = Q2();
                if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
                    TL_iv.PageBlock pageBlock = Q2.f46269b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && s5.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                V3();
                s4();
                this.U2.N(false);
                b2 b2Var2 = this.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                m3 m3Var = this.f46565d3;
                if (m3Var != null) {
                    m3Var.onContentChanged();
                }
            }
        }
    }

    public final a U3(int i9, int i10) {
        while (i9 >= 0) {
            ArrayList arrayList = this.f46582l4;
            if (i9 < arrayList.size()) {
                a aVar = (a) arrayList.get(i9);
                if (!aVar.f46274i) {
                    if (aVar.f46285t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f46269b;
                        if (E3(pageBlock) && !l3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i9 += i10;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i9, int i10, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f46573h3;
            if (arrayList.indexOf(aVar2) >= 0 && !x3(aVar2) && !aVar2.f46274i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f46269b;
                if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
                    s5 u22 = u2(arrayList.indexOf(aVar2));
                    if (u22 != null) {
                        A = u22.getEditText().getText();
                    } else {
                        A = s5.A(aVar2.f46269b);
                    }
                    s5.e(pageBlock, A);
                    TL_iv.RichText k10 = s5.k(aVar2.f46269b);
                    if (k10 != null && s5.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                R4(aVar2, pageBlock, i9, i10, z10, z11);
            }
        }
    }

    public final a V1(a aVar, int i9) {
        int i10;
        ArrayList arrayList = this.f46582l4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + i9) >= 0 && i10 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i10);
            if (aVar2.f46285t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void V2() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                s5Var.f46704f.n();
                s5Var.h.n();
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f46573h3;
            if (i9 < arrayList.size()) {
                a aVar = (a) arrayList.get(i9);
                if (!aVar.f46276k.isEmpty() && s5.p(aVar.f46269b)) {
                    long a2 = m0.a();
                    TL_iv.RichText k10 = s5.k(aVar.f46269b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f46575i3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f46276k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f46269b.text;
                    aVar.f46269b = pageblockparagraph;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.f46270c, aVar2.d, aVar2.f46271e, aVar2.f46272f);
    }

    public final boolean W1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.W1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean W3(qh.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.W3(qh.a, boolean):boolean");
    }

    public final void W4(a aVar, int i9) {
        int i10;
        boolean z10;
        boolean z11;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i9 == 0) {
            U4(aVar2, aVar2.f46269b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f46270c);
        if (i9 == 2) {
            i10 = Math.max(1, aVar2.d);
        } else {
            i10 = 0;
        }
        if (i9 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_iv.PageBlock pageBlock = aVar2.f46269b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f46272f) {
            z11 = true;
        } else {
            z11 = false;
        }
        U4(aVar2, pageBlock, max, i10, z10, z11);
    }

    public final void X1() {
        s5 s5Var;
        a aVar;
        p5 p5Var;
        this.U2.S();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof s5) && (aVar = (s5Var = (s5) childAt).f46709x) != null && (p5Var = s5Var.f46710y) != null) {
                s5Var.g(aVar, p5Var, s5Var.A);
            }
        }
    }

    public final void X3() {
        int length;
        int w8;
        int d;
        int length2;
        int w10;
        int d9;
        int length3;
        int w11;
        int d10;
        int length4;
        int w12;
        int d11;
        d1 N4;
        int length5;
        int w13;
        int d12;
        boolean L3 = L3();
        c3 c3Var = this.f46577j3;
        if (L3) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24775v0;
            if (i10 == c3Var.f24778y0 && (N4 = N4(i9, i10)) != null && (w13 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length5 = N4.length()), 0)) < (d12 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length5, 0))) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (u5.h(N4.getText(), w13, d12)) {
                    u5.n(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(w13, d12);
                N4.makeSelectedDate();
            }
        } else if (y3()) {
            int i11 = c3Var.f24774u0;
            d1 I2 = I2(i11);
            if (I2 != null && (w12 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length4 = I2.length()), 0)) < (d11 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length4, 0))) {
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (u5.h(I2.getText(), w12, d11)) {
                    u5.n(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(w12, d11);
                I2.makeSelectedDate();
            }
        } else if (w3()) {
            int i12 = c3Var.f24774u0;
            d1 s22 = s2(i12);
            if (s22 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length3 = s22.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length3, 0))) {
                b2 b2Var5 = this.F3;
                if (b2Var5 != null) {
                    b2Var5.d();
                }
                if (u5.h(s22.getText(), w11, d10)) {
                    u5.n(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(w11, d10);
                s22.makeSelectedDate();
            }
        } else if (G3()) {
            int i13 = c3Var.f24774u0;
            d1 j42 = j4(i13);
            if (j42 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length2 = j42.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length2, 0))) {
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (u5.h(j42.getText(), w10, d9)) {
                    u5.n(j42.getText(), w10, d9);
                    j42.invalidateEffects();
                    f4(i13);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(w10, d9);
                j42.makeSelectedDate();
            }
        } else {
            s5 G4 = G4();
            if (G4 == null || (w8 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length = G4.getEditText().length()), 0)) >= (d = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length, 0))) {
                return;
            }
            b2 b2Var9 = this.F3;
            if (b2Var9 != null) {
                b2Var9.d();
            }
            if (u5.h(G4.getEditText().getText(), w8, d)) {
                u5.n(G4.getEditText().getText(), w8, d);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var10 = this.F3;
                if (b2Var10 != null) {
                    b2Var10.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(w8, d);
            G4.getEditText().makeSelectedDate();
        }
    }

    public final a X4() {
        c3 c3Var;
        int i9;
        a Q2 = Q2();
        if (Q2 == null && (c3Var = this.f46577j3) != null && c3Var.y() && (i9 = c3Var.f24774u0) == c3Var.f24777x0) {
            return y4(i9);
        }
        return Q2;
    }

    public final boolean Y1(int i9, int i10) {
        c3 c3Var;
        ArrayList arrayList = this.J3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i9, i10));
            int max2 = Math.max(0, Math.max(i9, i10));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.J3.get(O3[0]);
            if (O3[0] != O32[0] && max != max2) {
                View z12 = z1(aVar);
                View z13 = z1(this.J3.get(O32[0]));
                if ((z12 instanceof s5) && (z13 instanceof s5)) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f46573h3;
                        int size = arrayList2.size();
                        c3Var = this.f46577j3;
                        if (i11 >= size) {
                            break;
                        }
                        c3Var.Y(i11, s5.z(((a) arrayList2.get(i11)).f46269b));
                        i11++;
                    }
                    s5 s5Var = (s5) z12;
                    int length = s5Var.getEditText().length();
                    if (O3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!c3Var.k0(s5Var, 0, O3[1], length)) {
                        s5Var.B();
                        return true;
                    }
                    c3Var.c0(0, O32[1], (s5) z13);
                    return true;
                }
            } else {
                View z14 = z1(aVar);
                if (z14 instanceof s5) {
                    s5 s5Var2 = (s5) z14;
                    s5Var2.B();
                    d1 editText = s5Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(O3[1], length2), Math.min(O32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Y2(int i9, int i10, int i11, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = i9;
        while (i14 < i10) {
            ArrayList arrayList2 = this.f46573h3;
            a aVar = (a) arrayList2.get(i14);
            boolean z12 = aVar.f46274i;
            ArrayList arrayList3 = aVar.f46276k;
            if (z12) {
                i14++;
            } else if (arrayList3.size() > i11) {
                Long l10 = (Long) arrayList3.get(i11);
                long longValue = l10.longValue();
                int i15 = i14 + 1;
                while (i15 < i10) {
                    a aVar2 = (a) arrayList2.get(i15);
                    if (aVar2.f46276k.size() <= i11 || ((Long) aVar2.f46276k.get(i11)).longValue() != longValue) {
                        break;
                    }
                    i15++;
                }
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i14, i15, i11 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f46575i3.get(l10);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Y2.size() == 1 && (Y2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (Y2.get(0).text != null) {
                            textempty = Y2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Y2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i14 = i15;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f46269b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i14);
                pageblockdetails.blocks = Y2(i14 + 1, Math.min(P3, i10), i11, true);
                arrayList.add(pageblockdetails);
                i14 = P3 + 1;
            } else {
                int i16 = aVar.f46270c;
                if (i16 <= 0) {
                    J2(arrayList, aVar);
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    int[] iArr = {i14};
                    if (aVar.d > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i12 = i10;
                    i13 = i11;
                    TL_iv.PageBlock k22 = k2(i14, i16, i12, i13, z11, iArr);
                    if (k22 != null) {
                        arrayList.add(k22);
                    }
                    int i17 = iArr[0];
                    if (i17 <= 0) {
                        i14 = i12;
                    } else {
                        i14 = i17;
                    }
                }
                i10 = i12;
                i11 = i13;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) j3.r0.j(1, arrayList))) {
                aa.d.u(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i9) {
        int i10;
        b2 b2Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        int length;
        int w8;
        int d;
        boolean z11;
        int i15;
        int length2;
        int w10;
        int d9;
        boolean z12;
        int i16;
        int length3;
        int w11;
        int d10;
        boolean z13;
        int i17;
        b2 b2Var2;
        int i18;
        int i19;
        int i20;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            boolean L3 = L3();
            m3 m3Var = this.f46565d3;
            int i21 = 0;
            if (L3) {
                int i22 = c3Var.f24774u0;
                int i23 = c3Var.f24775v0;
                int i24 = c3Var.f24778y0;
                int i25 = c3Var.f24776w0;
                int i26 = c3Var.f24779z0;
                boolean K3 = K3(i9, i22, i23, i25, i24, i26);
                if (!K3) {
                    i17 = w2(i9);
                } else {
                    i17 = 0;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                this.E3 = true;
                int i27 = i23;
                boolean z14 = false;
                while (i27 <= i24) {
                    d1 N4 = N4(i22, i27);
                    if (N4 == null) {
                        i20 = i23;
                    } else {
                        int length4 = N4.length();
                        if (i27 == i23) {
                            i18 = i25;
                        } else {
                            i18 = 0;
                        }
                        if (i27 == i24) {
                            i19 = i26;
                        } else {
                            i19 = length4;
                        }
                        if (i23 == i24) {
                            i18 = Math.min(i25, i26);
                            i19 = Math.max(i25, i26);
                        }
                        int i28 = i18;
                        i20 = i23;
                        int max = Math.max(0, Math.min(i28, length4));
                        int max2 = Math.max(0, Math.min(i19, length4));
                        if (max < max2) {
                            if (!K3) {
                                if (i17 != 0) {
                                    N4.removeStyle(i17, max, max2);
                                }
                                N4.addStyle(i9, max, max2);
                            } else {
                                N4.removeStyle(i9, max, max2);
                            }
                            N4.invalidateEffects();
                            N4.requestLayout();
                            g4(i22, i27);
                            z14 = true;
                        }
                    }
                    i27++;
                    i23 = i20;
                }
                this.E3 = false;
                if (z14 && (b2Var2 = this.F3) != null) {
                    b2Var2.h();
                }
                m3Var.h0();
                if (z14) {
                    o4();
                }
            } else if (y3()) {
                int i29 = c3Var.f24774u0;
                d1 I2 = I2(i29);
                if (I2 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length3 = I2.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length3, 0))) {
                    if ((I2.getCurrentStyle(w11, d10) & i9) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.d();
                    }
                    this.E3 = true;
                    if (z13) {
                        int w22 = w2(i9);
                        if (w22 != 0) {
                            I2.removeStyle(w22, w11, d10);
                        }
                        I2.addStyle(i9, w11, d10);
                    } else {
                        I2.removeStyle(i9, w11, d10);
                    }
                    this.E3 = false;
                    e4(i29);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else if (w3()) {
                int i30 = c3Var.f24774u0;
                d1 s22 = s2(i30);
                if (s22 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length2 = s22.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length2, 0))) {
                    if ((s22.getCurrentStyle(w10, d9) & i9) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = w2(i9);
                    } else {
                        i16 = 0;
                    }
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.d();
                    }
                    this.E3 = true;
                    if (z12) {
                        if (i16 != 0) {
                            s22.removeStyle(i16, w10, d9);
                        }
                        s22.addStyle(i9, w10, d9);
                    } else {
                        s22.removeStyle(i9, w10, d9);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i30);
                    this.E3 = false;
                    b2 b2Var7 = this.F3;
                    if (b2Var7 != null) {
                        b2Var7.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else if (G3()) {
                int i31 = c3Var.f24774u0;
                d1 j42 = j4(i31);
                if (j42 != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length = j42.length()), 0)) < (d = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length, 0))) {
                    if ((j42.getCurrentStyle(w8, d) & i9) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i15 = w2(i9);
                    } else {
                        i15 = 0;
                    }
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.d();
                    }
                    this.E3 = true;
                    if (z11) {
                        if (i15 != 0) {
                            j42.removeStyle(i15, w8, d);
                        }
                        j42.addStyle(i9, w8, d);
                    } else {
                        j42.removeStyle(i9, w8, d);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i31);
                    this.E3 = false;
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.h();
                    }
                    m3Var.h0();
                    o4();
                }
            } else {
                int i32 = c3Var.f24774u0;
                int i33 = c3Var.f24777x0;
                int i34 = c3Var.f24776w0;
                int i35 = c3Var.f24779z0;
                if (i32 >= 0 && i33 >= 0 && i33 >= i32 && i33 < this.f46582l4.size()) {
                    int i36 = i9;
                    boolean J3 = J3(i36, i32, i34, i33, i35);
                    boolean z15 = !J3;
                    if (!J3) {
                        i10 = w2(i36);
                    } else {
                        i10 = 0;
                    }
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.d();
                    }
                    this.E3 = true;
                    int i37 = i32;
                    boolean z16 = false;
                    while (i37 <= i33) {
                        a y42 = y4(i37);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.f46269b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i37);
                                if (i37 == i32) {
                                    i12 = i34;
                                } else {
                                    i12 = 0;
                                }
                                z10 = z16;
                                if (i37 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i210;
                                }
                                int max3 = Math.max(i21, Math.min(i12, i210));
                                int max4 = Math.max(i21, Math.min(i13, i210));
                                if (max3 >= max4) {
                                    i11 = i10;
                                    z16 = z10;
                                    i37++;
                                    i36 = i9;
                                    i10 = i11;
                                    i21 = 0;
                                } else {
                                    s5 u22 = u2(i37);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.u4 styleDelegate = u22.getStyleDelegate();
                                        if (!J3) {
                                            if (i10 != 0) {
                                                styleDelegate.removeStyle(i10, max3, max4);
                                            }
                                            styleDelegate.addStyle(i36, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i36, max3, max4);
                                        }
                                        u22.getEditText().invalidateEffects();
                                        u22.getEditText().requestLayout();
                                        u22.x();
                                        i11 = i10;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(s5.A(y42.f46269b));
                                        if (!J3 && i10 != 0) {
                                            i11 = i10;
                                            i14 = max3;
                                            u5.o(spannableStringBuilder2, i14, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i11 = i10;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i14 = max3;
                                        }
                                        u5.o(spannableStringBuilder, i14, max4, i36, z15, null);
                                        s5.e(y42.f46269b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i37++;
                                    i36 = i9;
                                    i10 = i11;
                                    i21 = 0;
                                }
                            }
                        }
                        i11 = i10;
                        z10 = z16;
                        z16 = z10;
                        i37++;
                        i36 = i9;
                        i10 = i11;
                        i21 = 0;
                    }
                    boolean z17 = z16;
                    this.E3 = false;
                    if (z17 && (b2Var = this.F3) != null) {
                        b2Var.h();
                    }
                    m3Var.h0();
                    if (z17) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f10, float f11) {
        TL_iv.pageTableCell m10;
        f5 f5Var = this.f46568e4;
        if (this.f46596x3 && f5Var != null && this.f46592t3 == f5Var && (m10 = f5Var.m((int) ((f10 - f5Var.getLeft()) - getLeft()), (int) ((f11 - f5Var.getTop()) - getTop()))) != null && m10 != this.A3) {
            this.A3 = m10;
            f5Var.w(this.f46598z3, m10);
        }
    }

    public final ArrayList Z2() {
        return Y2(0, this.f46573h3.size(), 0, false);
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.Z3(android.view.View):void");
    }

    public final void Z4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    s5 u22 = u2(this.f46573h3.indexOf(aVar));
                    if (u22 != null && (aVar2 = u22.f46709x) != null) {
                        u22.I(aVar2.f46269b, true);
                        u22.D = null;
                        u22.C();
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
            }
        }
    }

    public final void a2() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList6 = this.f46573h3;
            if (i10 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i10);
                ArrayList arrayList7 = aVar.f46275j;
                ArrayList arrayList8 = aVar.f46276k;
                arrayList7.clear();
                if (aVar.f46274i) {
                    if (!arrayList.isEmpty()) {
                        aa.d.u(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                        ((Long) arrayList8.get(i11)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        arrayList7.add((m0) arrayList.get(i12));
                    }
                    int max = Math.max(i9, aVar.f46270c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        for (int i13 = 1; i13 <= max; i13++) {
                            int i14 = i13 - 1;
                            if (i13 == max) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i14 < arrayList2.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 && z11) {
                                if (((Boolean) arrayList3.get(i14)).booleanValue() != z10) {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                while (arrayList2.size() > i14) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(m0.a()));
                                if (z11) {
                                    z14 = z10;
                                } else {
                                    z14 = false;
                                }
                                arrayList3.add(Boolean.valueOf(z14));
                                arrayList4.add(0);
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i14)).getClass();
                            if (z11) {
                                if (((Long) arrayList5.get(i14)).longValue() != 0 && E3(aVar.f46269b)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    arrayList4.set(i14, Integer.valueOf(((Integer) arrayList4.get(i14)).intValue() + 1));
                                    arrayList5.set(i14, Long.valueOf(aVar.f46268a));
                                } else {
                                    ((Integer) arrayList4.get(i14)).getClass();
                                    ((Long) arrayList5.get(i14)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i14)).getClass();
                                arrayList7.add(new Object());
                            }
                        }
                    }
                    if (x3(aVar)) {
                        boolean z15 = ((TL_iv.pageBlockDetails) aVar.f46269b).open;
                        m0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (s5.p(aVar.f46269b)) {
                        m0.a();
                        arrayList7.add(new Object());
                    }
                }
                i10++;
                i9 = 0;
            } else {
                return;
            }
        }
    }

    public final boolean a3() {
        a aVar;
        ArrayList arrayList = this.f46573h3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) j3.r0.j(1, arrayList);
        }
        if (aVar != null && !E3(aVar.f46269b) && !aVar.f46274i && !x3(aVar) && !K2(aVar.f46269b)) {
            if (!(z1(aVar) instanceof s5)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.U2.N(false);
        b2 b2Var2 = this.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        post(new i2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int w8;
        int d;
        int length2;
        int w10;
        int d9;
        int length3;
        int w11;
        int d10;
        int length4;
        int w12;
        int d11;
        d1 N4;
        int length5;
        int w13;
        int d12;
        boolean L3 = L3();
        m3 m3Var = this.f46565d3;
        c3 c3Var = this.f46577j3;
        if (L3) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24775v0;
            if (i10 == c3Var.f24778y0 && (N4 = N4(i9, i10)) != null && (w13 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length5 = N4.length()), 0)) < (d12 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length5, 0))) {
                if (u5.h(N4.getText(), w13, d12)) {
                    b2 b2Var = this.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    u5.n(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var3 = this.F3;
                if (b2Var3 != null) {
                    b2Var3.d();
                }
                if (u5.g(N4.getText(), w13, d12)) {
                    u5.m(N4.getText(), w13, d12);
                    N4.invalidateEffects();
                    g4(i9, i10);
                    b2 b2Var4 = this.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(w13, d12);
                o3(false);
                E4(N4);
            }
        } else if (y3()) {
            int i11 = c3Var.f24774u0;
            d1 I2 = I2(i11);
            if (I2 != null && (w12 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length4 = I2.length()), 0)) < (d11 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length4, 0))) {
                if (u5.h(I2.getText(), w12, d11)) {
                    b2 b2Var5 = this.F3;
                    if (b2Var5 != null) {
                        b2Var5.d();
                    }
                    u5.n(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var6 = this.F3;
                    if (b2Var6 != null) {
                        b2Var6.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var7 = this.F3;
                if (b2Var7 != null) {
                    b2Var7.d();
                }
                if (u5.g(I2.getText(), w12, d11)) {
                    u5.m(I2.getText(), w12, d11);
                    I2.invalidateEffects();
                    e4(i11);
                    b2 b2Var8 = this.F3;
                    if (b2Var8 != null) {
                        b2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(w12, d11);
                o3(false);
                E4(I2);
            }
        } else if (w3()) {
            int i12 = c3Var.f24774u0;
            d1 s22 = s2(i12);
            if (s22 != null && (w11 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length3 = s22.length()), 0)) < (d10 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length3, 0))) {
                if (u5.h(s22.getText(), w11, d10)) {
                    b2 b2Var9 = this.F3;
                    if (b2Var9 != null) {
                        b2Var9.d();
                    }
                    u5.n(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var10 = this.F3;
                    if (b2Var10 != null) {
                        b2Var10.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var11 = this.F3;
                if (b2Var11 != null) {
                    b2Var11.d();
                }
                if (u5.g(s22.getText(), w11, d10)) {
                    u5.m(s22.getText(), w11, d10);
                    s22.invalidateEffects();
                    d4(i12);
                    b2 b2Var12 = this.F3;
                    if (b2Var12 != null) {
                        b2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(w11, d10);
                o3(false);
                E4(s22);
            }
        } else if (G3()) {
            int i13 = c3Var.f24774u0;
            d1 j42 = j4(i13);
            if (j42 != null && (w10 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length2 = j42.length()), 0)) < (d9 = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length2, 0))) {
                if (u5.h(j42.getText(), w10, d9)) {
                    b2 b2Var13 = this.F3;
                    if (b2Var13 != null) {
                        b2Var13.d();
                    }
                    u5.n(j42.getText(), w10, d9);
                    j42.invalidateEffects();
                    f4(i13);
                    b2 b2Var14 = this.F3;
                    if (b2Var14 != null) {
                        b2Var14.h();
                    }
                    m3Var.h0();
                    o4();
                    return;
                }
                b2 b2Var15 = this.F3;
                if (b2Var15 != null) {
                    b2Var15.d();
                }
                if (u5.g(j42.getText(), w10, d9)) {
                    u5.m(j42.getText(), w10, d9);
                    j42.invalidateEffects();
                    f4(i13);
                    b2 b2Var16 = this.F3;
                    if (b2Var16 != null) {
                        b2Var16.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(w10, d9);
                o3(false);
                E4(j42);
            }
        } else {
            s5 G4 = G4();
            if (G4 == null || (w8 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length = G4.getEditText().length()), 0)) >= (d = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length, 0))) {
                return;
            }
            if (u5.h(G4.getEditText().getText(), w8, d)) {
                b2 b2Var17 = this.F3;
                if (b2Var17 != null) {
                    b2Var17.d();
                }
                u5.n(G4.getEditText().getText(), w8, d);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var18 = this.F3;
                if (b2Var18 != null) {
                    b2Var18.h();
                }
                m3Var.h0();
                o4();
                return;
            }
            b2 b2Var19 = this.F3;
            if (b2Var19 != null) {
                b2Var19.d();
            }
            if (u5.g(G4.getEditText().getText(), w8, d)) {
                u5.m(G4.getEditText().getText(), w8, d);
                G4.getEditText().invalidateEffects();
                G4.x();
                b2 b2Var20 = this.F3;
                if (b2Var20 != null) {
                    b2Var20.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(w8, d);
            o3(false);
            E4(G4.getEditText());
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            s sVar = new s();
            aVar.f46273g = sVar;
            sVar.f46670c = true;
            long j10 = document.f22386id;
            z10 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                s sVar2 = aVar.f46273g;
                sVar2.f46674i = document;
                sVar2.f46671e = str;
                sVar2.f46668a = 1;
                sVar2.f46672f = 0.0f;
            } else {
                sVar.h = document;
                sVar.f46674i = document;
                sVar.f46668a = 2;
                pageblockaudio.audio_id = j10;
            }
            u3(aVar);
            if (z10) {
                s sVar3 = aVar.f46273g;
                String str2 = sVar3.f46671e;
                IdentityHashMap identityHashMap = this.V3;
                r4 r4Var = (r4) identityHashMap.remove(sVar3);
                if (r4Var != null) {
                    r4Var.b();
                }
                r4 r4Var2 = new r4(this.f46561b3, str2, document, new z2(aVar, sVar3, this));
                identityHashMap.put(sVar3, r4Var2);
                r4Var2.d();
            }
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            this.f46565d3.onContentChanged();
        }
    }

    public final void b3(a aVar, boolean z10) {
        int i9;
        View z12 = z1(aVar);
        if (z12 instanceof x4) {
            d1 d1Var = ((x4) z12).f46831r;
            d1Var.r();
            if (z10) {
                i9 = d1Var.length();
            } else {
                i9 = 0;
            }
            d1Var.setSelection(i9);
            return;
        }
        c3(aVar, z10);
    }

    public final void b4() {
        d1 editText;
        Runnable e2Var;
        int length;
        final int w8;
        final int d;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            if (L3()) {
                int i9 = c3Var.f24774u0;
                int i10 = c3Var.f24775v0;
                if (i10 == c3Var.f24778y0) {
                    editText = N4(i9, i10);
                    e2Var = new j2(this, i9, i10, 1);
                } else {
                    return;
                }
            } else if (y3()) {
                int i11 = c3Var.f24774u0;
                editText = I2(i11);
                e2Var = new d2(this, i11, 3);
            } else if (w3()) {
                int i12 = c3Var.f24774u0;
                editText = s2(i12);
                e2Var = new d2(this, i12, 0);
            } else if (G3()) {
                int i13 = c3Var.f24774u0;
                editText = j4(i13);
                e2Var = new d2(this, i13, 1);
            } else {
                s5 G4 = G4();
                if (G4 != null) {
                    editText = G4.getEditText();
                    e2Var = new e2(G4, 0);
                } else {
                    return;
                }
            }
            final d1 d1Var = editText;
            final Runnable runnable = e2Var;
            if (d1Var != null && (w8 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length = d1Var.length()), 0)) <= (d = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length, 0))) {
                Editable text = d1Var.getText();
                int i14 = r.h;
                String str = null;
                if (text != null) {
                    r[] rVarArr = (r[]) text.getSpans(w8, d, r.class);
                    if (rVarArr.length > 0) {
                        str = rVarArr[0].f46640a;
                    }
                }
                if (str == null) {
                    str = d1Var.getText().subSequence(w8, d).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i15 = f6.G6;
                b6 b6Var = this.f46563c3;
                final int v02 = f6.v0(i15, b6Var);
                p.T(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        r a2;
                        String str2 = (String) obj;
                        o3 o3Var = o3.this;
                        o3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = r.a(str2, v02, dp)) == null) {
                            return;
                        }
                        b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        c3 c3Var2 = o3Var.f46577j3;
                        if (c3Var2 != null) {
                            c3Var2.f(false);
                        }
                        d1 d1Var2 = d1Var;
                        d1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = d1Var2.getText();
                        int max = Math.max(0, Math.min(w8, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(d, text2.length())), spannableString);
                        runnable.run();
                        b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.f46565d3.onContentChanged();
                        int min = Math.min(max + 1, d1Var2.length());
                        d1Var2.r();
                        o3Var.post(new o2(d1Var2, min, 3));
                    }
                }, b6Var);
            }
        }
    }

    public final void b5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.b5(java.lang.CharSequence):void");
    }

    public final void c2(String str) {
        String str2;
        int i9;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f22386id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i9 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i9).toLowerCase());
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "application/octet-stream";
            }
            tL_document.mime_type = str2;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (z12 instanceof f5) {
            f5 f5Var = (f5) z12;
            d1 d1Var = f5Var.f46392r;
            w5 w5Var = f5Var.B;
            if (w5Var != null) {
                if (!z10) {
                    d1Var.r();
                    d1Var.setSelection(0);
                    return;
                } else if (!w5Var.f46783g.isEmpty()) {
                    i5 m10 = f5Var.v.m((TL_iv.pageTableCell) j3.r0.j(1, f5Var.B.f46783g));
                    if (m10 != null) {
                        d1 d1Var2 = m10.f46448a;
                        d1Var2.r();
                        d1Var2.setSelection(d1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (z12 instanceof s5)) {
            s5 s5Var = (s5) z12;
            if (s5Var.n()) {
                s5Var.i();
                return;
            }
        }
        d1 R3 = R3(z12);
        if (R3 == null) {
            d3(aVar);
            return;
        }
        R3.r();
        if (z10) {
            R3.setSelection(R3.length());
        }
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.c4():void");
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document != null) {
            b2 b2Var = this.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            s sVar = new s();
            aVar.f46273g = sVar;
            sVar.d = true;
            long j10 = document.f22386id;
            z10 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                if (!TextUtils.isEmpty(str) && e2.c.w(str)) {
                    s sVar2 = aVar.f46273g;
                    sVar2.h = document;
                    sVar2.f46671e = str;
                    sVar2.f46668a = 1;
                    sVar2.f46672f = 0.0f;
                } else {
                    return;
                }
            } else {
                sVar.h = document;
                sVar.f46668a = 2;
                pageblockdocument.document_id = j10;
            }
            u3(aVar);
            if (z10) {
                s sVar3 = aVar.f46273g;
                IdentityHashMap identityHashMap = this.V3;
                r4 r4Var = (r4) identityHashMap.remove(sVar3);
                if (r4Var != null) {
                    r4Var.b();
                }
                r4 r4Var2 = new r4(this.f46561b3, str, document, new y2(this, sVar3, aVar, str));
                identityHashMap.put(sVar3, r4Var2);
                r4Var2.d();
            }
            b2 b2Var2 = this.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            this.f46565d3.onContentChanged();
        }
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            ((s5) z12).B();
        } else if (z12 instanceof q0) {
            ((q0) z12).d.r();
        }
    }

    public final void d4(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof i0) {
            ((i0) A4).b();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i9;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i10;
        int i11;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f10;
        boolean z10;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                arrayList = this.f46582l4;
                if (i12 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i12));
                if (R >= 0 && R < arrayList.size()) {
                    aVar4 = (a) arrayList.get(R);
                } else {
                    aVar4 = null;
                }
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.f46276k;
                    if (arrayList3.size() > i13) {
                        i13 = arrayList3.size();
                    }
                }
                i12++;
            }
            if (i13 != 0) {
                if (this.f46584m4 == null) {
                    dl0 dl0Var = new dl0(this);
                    this.f46584m4 = dl0Var;
                    dl0Var.a(null, null, null, this.f46563c3, 1);
                    v6.a(this.f46584m4, this.f46563c3);
                }
                int i14 = 0;
                while (i14 < i13) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    float f12 = 0.0f;
                    int i15 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f13 = 1.0f;
                    while (i15 <= childCount) {
                        if (i15 < childCount) {
                            View childAt = getChildAt(i15);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f46276k;
                                if (i14 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i14);
                                    i9 = childCount;
                                    view = childAt;
                                }
                            }
                            i9 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i9 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i10 = i14;
                            i11 = i13;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                        } else {
                            int k42 = k4(i14, aVar5, true);
                            l11 = l10;
                            int k43 = k4(i14, aVar6, false);
                            if (f12 - f11 <= AndroidUtilities.dp(4.0f)) {
                                i10 = i14;
                                i11 = i13;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i14;
                                i10 = i14;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i11 = i13;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.l0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f11, B, f12 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f46584m4.b(canvas, rectF, floor, floor, floor, f13);
                                    f10 = f13;
                                    this.f46584m4.e(canvas, rectF, f10);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                            z11 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z11) {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f10 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.O3) {
                                z11 = z10;
                            } else {
                                float y10 = view.getY();
                                float height = view.getHeight() + y10;
                                if (y10 < f11) {
                                    f11 = y10;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f13 = Math.min(f10, view.getAlpha());
                                z11 = z10;
                                i15++;
                                aVar6 = aVar;
                                childCount = i9;
                                i14 = i10;
                                i13 = i11;
                                arrayList = arrayList2;
                            }
                        } else {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        }
                        f13 = f10;
                        i15++;
                        aVar6 = aVar;
                        childCount = i9;
                        i14 = i10;
                        i13 = i11;
                        arrayList = arrayList2;
                    }
                    i14++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.X3;
            String str = null;
            this.X3 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i9 = this.f46586n4;
            this.f46586n4 = i9 - 1;
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(this, uri, z10, str2, i9, aVar));
        }
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            s5 s5Var = (s5) z12;
            s5Var.B();
            d1 editText = s5Var.getEditText();
            editText.setSelection(editText.length());
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            d1 editText2 = q0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i9) {
        a y42 = y4(i9);
        d1 I2 = I2(i9);
        if (x3(y42) && I2 != null) {
            ((TL_iv.pageBlockDetails) y42.f46269b).title = u5.f(I2.getText());
        }
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        o3 o3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b2 b2Var = this.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        boolean c10 = n4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f46273g = T3(photoEntry, str2);
        u3(aVar);
        if (c10) {
            K4(aVar, aVar.f46273g, photoEntry);
            o3Var = this;
        } else {
            o3Var = this;
            o3Var.L4(aVar, aVar.f46273g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        o3Var.f46565d3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof s5) {
            s5 s5Var = (s5) z12;
            s5Var.B();
            s5Var.getEditText().setSelection(0);
        } else if (z12 instanceof q0) {
            q0 q0Var = (q0) z12;
            q0Var.d.r();
            q0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof s5) {
            ((s5) A4).w();
        }
    }

    public final void g2(f5 f5Var) {
        f5 f5Var2 = this.f46568e4;
        if (f5Var2 != null && f5Var2 != f5Var) {
            LinkedHashSet linkedHashSet = f5Var2.D;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                f5Var2.v.invalidate();
                f5Var2.t();
            }
        }
        this.f46568e4 = f5Var;
        this.f46597y3 = false;
        this.f46574h4 = -1;
        this.f46572g4 = -1;
        f5Var.setCellSelectionListener(this.f46576i4);
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y()) {
            c3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i9, int i10) {
        i5 m10;
        View A4 = A4(i9);
        if (A4 instanceof f5) {
            f5 f5Var = (f5) A4;
            if (i10 == 0) {
                f5Var.u();
                return;
            }
            TL_iv.pageTableCell h = f5Var.h(i10);
            if (h != null && (m10 = f5Var.getGrid().m(h)) != null) {
                w5.d(h, m10.f46448a.getText());
            }
        }
    }

    public d1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof d1) {
            return (d1) findFocus;
        }
        return null;
    }

    public d4 getMapDelegate() {
        return this.Z3;
    }

    public View getOverlayView() {
        return this.f46579k3;
    }

    public n9 getTextSelectionHelper() {
        return this.f46577j3;
    }

    public final f3 h2() {
        int i9;
        int i10;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y() && !G3()) {
            a y42 = y4(c3Var.f24774u0);
            ArrayList arrayList = this.f46573h3;
            int indexOf = arrayList.indexOf(y42);
            int indexOf2 = arrayList.indexOf(y4(c3Var.f24777x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i10 = indexOf;
                    i9 = indexOf2;
                } else {
                    i9 = indexOf;
                    i10 = indexOf2;
                }
                for (int i11 = i9; i11 <= i10; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    if (aVar.f46274i || x3(aVar)) {
                        return null;
                    }
                }
                return new f3(this, i9, i10, c3Var.f24776w0, c3Var.f24779z0);
            }
            return null;
        }
        return null;
    }

    public final boolean h3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.h3(android.view.KeyEvent):boolean");
    }

    public final int i2(int i9) {
        d1 I2 = I2(i9);
        if (I2 != null) {
            return I2.length();
        }
        s5 u22 = u2(i9);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i9);
        if (y42 == null) {
            return 0;
        }
        return s5.z(y42.f46269b).length();
    }

    public final boolean i3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.i3(android.view.MotionEvent):boolean");
    }

    public final int i4(int i9) {
        Layout layout;
        View A4 = A4(i9);
        if (!(A4 instanceof s5) || (layout = ((s5) A4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (k3()) {
            ArrayList<TL_iv.PageBlock> Z2 = Z2();
            if (Z2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2();
            richMessage.documents = y2();
            return richMessage;
        }
        return null;
    }

    public final boolean j3(qh.f5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.j3(qh.f5, int, int):boolean");
    }

    public final d1 j4(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof s5) {
            return ((s5) A4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock k2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.k2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean k3() {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.k3():boolean");
    }

    public final boolean l2() {
        d1 editText;
        int length;
        int w8;
        int d;
        b4[] b4VarArr;
        c3 c3Var = this.f46577j3;
        if (c3Var == null || !c3Var.y() || c3Var.f24774u0 != c3Var.f24777x0) {
            return false;
        }
        if (L3()) {
            int i9 = c3Var.f24774u0;
            int i10 = c3Var.f24775v0;
            if (i10 != c3Var.f24778y0) {
                return false;
            }
            editText = N4(i9, i10);
        } else if (y3()) {
            editText = I2(c3Var.f24774u0);
        } else if (w3()) {
            editText = s2(c3Var.f24774u0);
        } else if (G3()) {
            editText = j4(c3Var.f24774u0);
        } else {
            s5 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (w8 = org.telegram.ui.Cells.j2.w(c3Var.f24776w0, c3Var.f24779z0, (length = editText.length()), 0)) >= (d = org.telegram.ui.Cells.j2.d(c3Var.f24776w0, c3Var.f24779z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && w8 < d) {
            for (b4 b4Var : (b4[]) text.getSpans(w8, d, b4.class)) {
                if (text.getSpanStart(b4Var) < d && text.getSpanEnd(b4Var) > w8) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] D4 = D4();
        if (D4 == null) {
            return n2(D2());
        }
        for (int i9 = D4[0]; i9 <= D4[1]; i9++) {
            if (n2((a) this.f46573h3.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f46573h3;
            if (i9 >= arrayList.size()) {
                return false;
            }
            for (s sVar : Q3((a) arrayList.get(i9))) {
                if (sVar.a()) {
                    return true;
                }
            }
            i9++;
        }
    }

    public final boolean m4(int i9, int i10, boolean z10) {
        boolean z11;
        if (i9 >= 0 && i10 >= i9) {
            ArrayList arrayList = this.f46573h3;
            if (i10 < arrayList.size()) {
                b2 b2Var = this.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i10 >= i9) {
                        if (q3(i10, true, true)) {
                            z11 = true;
                        }
                        i10--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i9);
                    if (aVar.f46270c >= 1 && (i9 == 0 || ((a) arrayList.get(i9 - 1)).f46270c < aVar.f46270c)) {
                        return false;
                    }
                    z11 = false;
                    while (i9 <= i10) {
                        if (q3(i9, false, true)) {
                            z11 = true;
                        }
                        i9++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof d1) {
                        X1();
                    } else {
                        this.U2.N(false);
                    }
                    b2 b2Var2 = this.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f46573h3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f46270c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f46269b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f46270c < aVar2.f46270c) {
                return false;
            }
            if (p3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n3() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                s5Var.f46704f.hideActionMode();
                s5Var.h.hideActionMode();
            } else if (childAt instanceof f5) {
                f5 f5Var = (f5) childAt;
                h5 h5Var = f5Var.v;
                f5Var.f46392r.hideActionMode();
                for (int i10 = 0; i10 < h5Var.getChildCount(); i10++) {
                    View childAt2 = h5Var.getChildAt(i10);
                    if (childAt2 instanceof i5) {
                        ((i5) childAt2).f46448a.hideActionMode();
                    }
                }
            } else if (childAt instanceof i0) {
                ((i0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof q0) {
                ((q0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof l4) {
            l4 l4Var = (l4) z12;
            ArrayList arrayList = l4Var.f46514y;
            if (l4Var.f46834a != null) {
                l4Var.n();
                if (l4Var.S >= arrayList.size()) {
                    l4Var.S = Math.max(0, arrayList.size() - 1);
                }
                l4Var.o(false);
                l4Var.requestLayout();
                l4Var.invalidate();
            }
        }
    }

    public final boolean o2(int i9) {
        if (i9 > 0) {
            ArrayList arrayList = this.f46573h3;
            if (i9 < arrayList.size() && E3(((a) arrayList.get(i9)).f46269b) && ((a) arrayList.get(i9 - 1)).f46270c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3(boolean z10) {
        c3 c3Var = this.f46577j3;
        if (c3Var != null) {
            if (z10) {
                c3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(c3Var.f24103r0);
                c3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.I3);
        this.W2 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        View F;
        int i13 = i12 - i10;
        int i14 = this.G3;
        if (i14 > 0 && i13 < i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        if (z11) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i13 - getPaddingBottom());
                if (dp > 0) {
                    post(new d2(this, dp, 2));
                }
            }
        }
        this.G3 = i13;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i9 = D4[0]; i9 <= D4[1]; i9++) {
            if (q2((a) this.f46573h3.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i9) {
        if (((a) this.f46573h3.get(i9)).f46270c + 1 <= MessagesController.getInstance(this.f46561b3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void p4(int i9) {
        ArrayList arrayList = this.f46573h3;
        int min = Math.min(arrayList.size() - 1, i9 + 1);
        for (int max = Math.max(0, i9 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f46270c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof s5) {
                    ((s5) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f46573h3).indexOf(aVar)) < 0 || aVar.f46270c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f46270c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q3(int i9, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i10;
        int i11 = 0;
        if (i9 >= 0) {
            ArrayList arrayList = this.f46573h3;
            if (i9 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i9);
                if (z10) {
                    if (aVar2.f46270c > 0) {
                        t2(i9);
                        return true;
                    }
                } else if (aVar2.f46270c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f46269b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || o2(i9)) && p3(i9)) {
                        if (i9 > 0) {
                            aVar = (a) arrayList.get(i9 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f46270c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i11 = 1;
                            }
                            aVar2.d = i11;
                            return true;
                        }
                        aVar2.f46270c = aVar.f46270c;
                        if (aVar.d > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        aVar2.d = i10;
                        aVar2.f46271e = false;
                        aVar2.f46272f = false;
                        return true;
                    }
                } else if ((z11 || (i9 != 0 && ((a) arrayList.get(i9 - 1)).f46270c >= aVar2.f46270c)) && p3(i9)) {
                    aVar2.f46270c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, s sVar) {
        int i9;
        if (aVar == null) {
            return;
        }
        if (B3(aVar.f46269b)) {
            ArrayList g32 = g3(aVar.f46269b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i9 = arrayList.indexOf(sVar);
            } else {
                i9 = -1;
            }
            if (i9 >= 0) {
                aVar.h.remove(i9);
                if (g32 != null && i9 < g32.size()) {
                    g32.remove(i9);
                }
            }
            if (aVar.h.isEmpty()) {
                r4(aVar);
                return;
            }
            int size = aVar.h.size();
            z41 z41Var = this.U2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f46269b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
                aVar.f46269b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f46273g = (s) aVar.h.get(0);
                aVar.h = null;
                z41Var.N(true);
                n4(aVar);
                return;
            }
            z41Var.N(true);
            n4(aVar);
            return;
        }
        r4(aVar);
    }

    public final boolean r2() {
        b2 b2Var = this.F3;
        if (b2Var != null) {
            if (b2Var.f46307e || !b2Var.f46305b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z10) {
        a aVar;
        int i9;
        int i10;
        int[] D4 = D4();
        if (D4 != null && (i9 = D4[0]) != (i10 = D4[1])) {
            m4(i9, i10, z10);
            return;
        }
        if (D4 == null) {
            aVar = D2();
        } else {
            aVar = (a) this.f46573h3.get(D4[0]);
        }
        if (aVar != null) {
            W3(aVar, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.f46573h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.U2.N(true);
        }
    }

    public final d1 s2(int i9) {
        View A4 = A4(i9);
        if (A4 instanceof i0) {
            return ((i0) A4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f46276k;
        int size = arrayList3.size();
        int i9 = 0;
        while (i9 < size && i9 < arrayList.size() && ((Long) arrayList3.get(i9)).equals(arrayList.get(i9))) {
            i9++;
        }
        for (int i10 = size - 1; i10 >= i9; i10--) {
            Long l10 = (Long) arrayList3.get(i10);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i10 != 0 || this.f46575i3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f46285t = longValue;
                for (int i11 = 0; i11 <= i10; i11++) {
                    aVar2.f46276k.add((Long) arrayList3.get(i11));
                }
                int i12 = w4.f46777a;
                l41 J = l41.J(w4.class);
                J.G = aVar2;
                J.H = this.f46562b4;
                arrayList2.add(J);
                this.f46582l4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f46573h3;
            if (i9 < arrayList.size()) {
                a aVar = (a) arrayList.get(i9);
                if (aVar.f46270c > 0 && aVar.d > 0 && !E3(aVar.f46269b)) {
                    int i10 = aVar.f46270c;
                    int i11 = 1;
                    for (int i12 = i9 - 1; i12 >= 0; i12--) {
                        a aVar2 = (a) arrayList.get(i12);
                        int i13 = aVar2.f46270c;
                        if (i13 < i10) {
                            break;
                        }
                        if (i13 == i10 && !E3(aVar2.f46269b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i11++;
                        }
                    }
                    aVar.d = i11;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f46569f3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.N3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f46567e3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.J3 = new ArrayList();
        ArrayList arrayList = this.f46573h3;
        W2(arrayList, t4.b(charSequence), this.f46575i3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.J3.add((a) arrayList.get(size));
        }
        this.U2.N(false);
    }

    public final void t2(int i9) {
        a aVar;
        int i10;
        ArrayList arrayList = this.f46573h3;
        a aVar2 = (a) arrayList.get(i9);
        int i11 = aVar2.f46270c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            aVar2.f46270c = i12;
            if (i12 == 0) {
                aVar2.d = 0;
                aVar2.f46271e = false;
                aVar2.f46272f = false;
            }
            while (true) {
                i9++;
                if (i9 < arrayList.size() && (i10 = (aVar = (a) arrayList.get(i9)).f46270c) > i11) {
                    aVar.f46270c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void t3() {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.t3():void");
    }

    public final void t4(String str) {
        c3 c3Var = this.f46577j3;
        W1(c3Var.f24774u0, c3Var.f24776w0, c3Var.f24777x0, c3Var.f24779z0, str.split("\n", -1));
    }

    public final s5 u2(int i9) {
        if (i9 < 0) {
            return null;
        }
        View m10 = this.T2.m(i9);
        if (!(m10 instanceof s5)) {
            return null;
        }
        return (s5) m10;
    }

    public final void u3(qh.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: qh.o3.u3(qh.a):void");
    }

    public final s u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document S2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (S2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.f46670c = true;
            sVar.f46668a = 2;
            sVar.h = S2;
            sVar.f46674i = S2;
            return sVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f46668a = 2;
            sVar2.h = S22;
            return sVar2;
        } else {
            int i9 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document S23 = S2(pageblockvideo.video_id);
                if (S23 == null) {
                    return null;
                }
                s sVar3 = new s();
                sVar3.f46669b = true;
                sVar3.f46668a = 2;
                sVar3.h = S23;
                sVar3.f46679n = pageblockvideo.spoiler;
                while (i9 < S23.attributes.size()) {
                    if (S23.attributes.get(i9) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i9);
                        sVar3.f46675j = tL_documentAttributeVideo.f22387w;
                        sVar3.f46676k = tL_documentAttributeVideo.h;
                        return sVar3;
                    }
                    i9++;
                }
                return sVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 == 0) {
                    photo = null;
                } else {
                    int i11 = 0;
                    loop1: while (true) {
                        if (i11 < this.f46573h3.size()) {
                            for (s sVar4 : Q3((a) this.f46573h3.get(i11))) {
                                if (sVar4 != null && (photo = sVar4.f46673g) != null && photo.f22404id == j10) {
                                    break loop1;
                                }
                            }
                            i11++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f46571g3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i9 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i9);
                                    i9++;
                                    photo = photo2;
                                    if (photo != null && photo.f22404id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = m4.f46523a;
                            synchronized (m4.class) {
                                if (i10 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) m4.f46523a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                s sVar5 = new s();
                sVar5.f46668a = 2;
                sVar5.f46673g = photo;
                sVar5.f46679n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    sVar5.f46675j = closestPhotoSizeWithSize.f22405w;
                    sVar5.f46676k = closestPhotoSizeWithSize.h;
                }
                return sVar5;
            }
        }
    }

    public final void v2() {
        G2();
        this.f46571g3 = null;
        this.X3 = null;
        this.Y3 = null;
        this.F3 = new b2(this.f46580k4);
        z4();
        this.F3.j();
        m3 m3Var = this.f46565d3;
        if (m3Var != null) {
            m3Var.N1();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f46571g3 != null && aVar != null && (pageBlock = aVar.f46269b) != null) {
            if (B3(pageBlock)) {
                ArrayList g32 = g3(aVar.f46269b);
                aVar.h = new ArrayList();
                if (g32 != null) {
                    for (int i9 = 0; i9 < g32.size(); i9++) {
                        s u42 = u4((TL_iv.PageBlock) g32.get(i9));
                        ArrayList arrayList = aVar.h;
                        if (u42 == null) {
                            u42 = new s();
                        }
                        arrayList.add(u42);
                    }
                    return;
                }
                return;
            }
            s u43 = u4(aVar.f46269b);
            if (u43 != null) {
                aVar.f46273g = u43;
            }
        }
    }

    public final boolean w3() {
        int i9;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y() && (i9 = c3Var.f24774u0) == c3Var.f24777x0 && i9 >= 0 && i9 < this.f46582l4.size()) {
            return A4(i9) instanceof i0;
        }
        return false;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a aVar = (a) obj;
            if (B3(aVar.f46269b)) {
                ArrayList g32 = g3(aVar.f46269b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (g32 != null) {
                    int size2 = g32.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = g32.get(i10);
                        i10++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s u42 = u4(pageBlock);
                        if (u42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(u42);
                        }
                    }
                    g32.clear();
                    g32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f46269b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    s u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.f46273g = u43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            arrayList = this.f46573h3;
            if (i9 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            boolean z10 = aVar.f46274i;
            ArrayList arrayList2 = aVar.f46276k;
            if (!z10) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i10), 1, new Object());
                }
            }
            i9++;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            ArrayList arrayList3 = aVar2.f46276k;
            if (arrayList3.size() == 1 && (aVar2.f46269b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f46269b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f46575i3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f46269b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void x4() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof c4) {
                y yVar = (y) ((c4) childAt);
                yVar.f46835b.a(yVar.f46834a, new kh.p(yVar, 20));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f46573h3;
            if (i9 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i9);
                if ((aVar.f46269b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f46273g) != null && sVar.b() && (document2 = aVar.f46273g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f46269b).document_id = document2.f22386id;
                }
                for (s sVar2 : Q3(aVar)) {
                    if (sVar2.b() && (document = sVar2.h) != null) {
                        long j10 = document.f22386id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(sVar2.h);
                        }
                    }
                }
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean y3() {
        int i9;
        c3 c3Var = this.f46577j3;
        if (c3Var != null && c3Var.y() && (i9 = c3Var.f24774u0) == c3Var.f24777x0 && x3(y4(i9))) {
            return true;
        }
        return false;
    }

    public final a y4(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f46582l4;
            if (i9 < arrayList.size()) {
                return (a) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final ArrayList z2(int i9, int i10) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i9 <= i10) {
            ArrayList arrayList2 = this.f46573h3;
            if (i9 >= arrayList2.size()) {
                break;
            }
            for (s sVar : Q3((a) arrayList2.get(i9))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f22386id))) {
                    arrayList.add(sVar.h);
                }
            }
            i9++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.f46573h3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.U2.N(false);
    }
}
