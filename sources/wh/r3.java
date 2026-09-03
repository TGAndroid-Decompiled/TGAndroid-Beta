package wh;

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
import k7.l8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w51;
public final class r3 extends h61 {
    public static final ArrayList f50010p4 = new ArrayList();
    public TL_iv.pageTableCell A3;
    public TL_iv.pageTableCell B3;
    public long C3;
    public float D3;
    public float E3;
    public boolean F3;
    public d2 G3;
    public int H3;
    public e1 I3;
    public final i J3;
    public ArrayList K3;
    public int L3;
    public int M3;
    public int N3;
    public boolean O3;
    public a P3;
    public boolean Q3;
    public final j3 R3;
    public final n2 S3;
    public final k3 T3;
    public final l3 U3;
    public final m3 V3;
    public final IdentityHashMap W3;
    public final IdentityHashMap X3;
    public a Y3;
    public a Z3;
    public final n3 f50011a4;
    public final w2 f50012b4;
    public final int c3;
    public final x2 f50013c4;
    public final g6 f50014d3;
    public final y2 f50015d4;
    public final p3 f50016e3;
    public final z2 f50017e4;
    public MessageObject f50018f3;
    public i5 f50019f4;
    public boolean f50020g3;
    public q70 f50021g4;
    public TL_iv.RichMessage f50022h3;
    public int f50023h4;
    public final ArrayList f50024i3;
    public int f50025i4;
    public final HashMap f50026j3;
    public final o2 f50027j4;
    public final f3 f50028k3;
    public final a3 f50029k4;
    public final y9 f50030l3;
    public final ai f50031l4;
    public int f50032m3;
    public final ArrayList f50033m4;
    public int f50034n3;
    public am0 f50035n4;
    public int f50036o3;
    public int f50037o4;
    public boolean f50038p3;
    public float f50039q3;
    public float f50040r3;
    public float f50041s3;
    public float f50042t3;
    public View f50043u3;
    public b f50044v3;
    public boolean f50045w3;
    public boolean f50046x3;
    public boolean f50047y3;
    public boolean f50048z3;

    public r3(Context context, int i10, g6 g6Var, p3 p3Var) {
        super(context, i10, 0, false, new qh.c4(r1, 29), new sf.h(r1, 15), null, g6Var);
        this.f50020g3 = true;
        this.f50024i3 = new ArrayList();
        this.f50026j3 = new HashMap();
        this.f50032m3 = -1;
        this.f50034n3 = -1;
        this.f50036o3 = 0;
        this.J3 = new i(this, 2);
        this.O3 = true;
        this.R3 = new j3(this);
        this.S3 = new n2(this);
        this.T3 = new k3(this);
        this.U3 = new l3(this);
        this.V3 = new m3(this);
        this.W3 = new IdentityHashMap();
        this.X3 = new IdentityHashMap();
        this.f50011a4 = new n3(this);
        this.f50012b4 = new w2(this);
        this.f50013c4 = new x2(this);
        this.f50015d4 = new y2(this);
        this.f50017e4 = new z2(this);
        this.f50023h4 = -1;
        this.f50025i4 = -1;
        this.f50027j4 = new o2(this);
        this.f50029k4 = new a3(this);
        ai aiVar = new ai(this, 21);
        this.f50031l4 = aiVar;
        this.f50033m4 = new ArrayList();
        this.f50037o4 = -1;
        r3[] r3VarArr = {this};
        this.c3 = i10;
        this.f50014d3 = g6Var;
        this.f50016e3 = p3Var;
        this.V2.f32651r = false;
        setClipToPadding(false);
        setClipChildren(false);
        A1(new p2(this, 0), false);
        setReorderLongPressEnabled(false);
        v1(true);
        f3 f3Var = new f3(this, p3Var);
        this.f50028k3 = f3Var;
        f3Var.T(this);
        f3Var.E0 = this.U2;
        y9 o10 = f3Var.o(context);
        this.f50030l3 = o10;
        AndroidUtilities.removeFromParent(o10);
        f3Var.D = new h3(this, p3Var);
        j(new kh.l(9, this, p3Var));
        this.G3 = new d2(aiVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !A3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean E3(a aVar) {
        if (aVar != null && !aVar.f49658i && !w3(aVar) && (aVar.f49653b instanceof TL_iv.pageBlockParagraph) && aVar.f49654c == 0 && aVar.d == 0 && !aVar.f49655e && aVar.f49660k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void H1(wh.r3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.w51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.H1(wh.r3[], java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    public static void I2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f49653b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            t tVar = aVar.f49657g;
            if (tVar != null && tVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f49653b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f49653b.caption.text = new TL_iv.textEmpty();
                        aVar.f49653b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f49653b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            t tVar2 = aVar.f49657g;
            if (tVar2 != null && tVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f49653b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f49653b.caption.text = new TL_iv.textEmpty();
                        aVar.f49653b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f49653b);
                }
            }
        } else if (A3(pageBlock)) {
            ArrayList f32 = f3(aVar.f49653b);
            List P3 = P3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; f32 != null && i12 < f32.size() && i12 < P3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) f32.get(i12);
                if (((t) P3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        i0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f49653b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f49653b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f49653b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                i0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f49653b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                t tVar3 = aVar.f49657g;
                if (tVar3 != null && tVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f49653b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f49653b.caption.text = new TL_iv.textEmpty();
                            aVar.f49653b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f49653b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                t tVar4 = aVar.f49657g;
                if (tVar4 != null && (document = tVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f20851id;
                }
                if (tVar4 != null && tVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f49653b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        i0.d(pageBlock7);
                        arrayList.add(aVar.f49653b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = i4.J;
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
                    arrayList.add(aVar.f49653b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
                        if (pagetablerow.cells != null) {
                            for (int i15 = 0; i15 < pagetablerow.cells.size(); i15++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i15);
                                if (pagetablecell.text == null) {
                                    z5.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i10 = pagetablecell.flags | 2;
                                } else {
                                    i10 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i10;
                                if (pagetablecell.rowspan > 1) {
                                    i11 = pagetablecell.flags | 4;
                                } else {
                                    i11 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i11;
                            }
                        }
                    }
                }
                if (N4(pageblocktable)) {
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

    public static void J1(r3 r3Var, int i10, int i11, int i12) {
        e1 editText;
        if (i10 >= 0) {
            View m9 = r3Var.U2.m(i10);
            if (m9 instanceof v5) {
                v5 v5Var = (v5) m9;
                if (i11 == 1 && v5Var.n()) {
                    editText = v5Var.getAuthorEditText();
                } else {
                    editText = v5Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m9 instanceof i5) {
                i5 i5Var = (i5) m9;
                e1 l10 = i5Var.l(i11);
                if (l10 == null) {
                    l10 = i5Var.l(0);
                }
                if (l10 != null) {
                    l10.s();
                    l10.setSelection(Math.max(0, Math.min(i12, l10.length())));
                }
            } else if (m9 instanceof j0) {
                e1 captionEditText = ((j0) m9).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean J2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock K1(wh.r3 r2, wh.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.K1(wh.r3, wh.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void K2(TL_iv.PageBlock pageBlock) {
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

    public static void L1(r3 r3Var, e1 e1Var) {
        if (e1Var == null) {
            r3Var.getClass();
            return;
        }
        e1Var.adaptiveCreateLinkDialog = r3Var.f50020g3;
        e1Var.setInlineButtonContext(r3Var.c3);
        e1Var.setInlineButtonClickListener(new o2(r3Var));
    }

    public static void M1(a aVar, t tVar, r3 r3Var) {
        p3 p3Var = r3Var.f50016e3;
        IdentityHashMap identityHashMap = r3Var.X3;
        IdentityHashMap identityHashMap2 = r3Var.W3;
        if (tVar == null) {
            ArrayList arrayList = r3Var.f50024i3;
            for (t tVar2 : P3(aVar)) {
                u4 u4Var = (u4) identityHashMap2.remove(tVar2);
                if (u4Var != null) {
                    u4Var.b();
                }
                q4 q4Var = (q4) identityHashMap.remove(tVar2);
                if (q4Var != null) {
                    q4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                d2 d2Var = r3Var.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                arrayList.remove(indexOf);
                r3Var.V2.N(true);
                d2 d2Var2 = r3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
            }
            p3Var.onContentChanged();
            return;
        }
        u4 u4Var2 = (u4) identityHashMap2.remove(tVar);
        if (u4Var2 != null) {
            u4Var2.b();
        }
        q4 q4Var2 = (q4) identityHashMap.remove(tVar);
        if (q4Var2 != null) {
            q4Var2.a();
        }
        d2 d2Var3 = r3Var.G3;
        if (d2Var3 != null) {
            d2Var3.d();
        }
        r3Var.p4(aVar, tVar);
        d2 d2Var4 = r3Var.G3;
        if (d2Var4 != null) {
            d2Var4.h();
        }
        p3Var.onContentChanged();
    }

    public static void M2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z4, int i11, boolean z10, boolean z11) {
        boolean z12 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z12) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            R1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z10, z11);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.f49655e = z10;
                            aVar.f49656f = z11;
                            arrayList.add(aVar);
                        }
                        z12 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z4 ? 1 : 0));
                    }
                } else {
                    if (!z12) {
                        R1(arrayList, null, i10, i11, z10, z11);
                        z12 = true;
                    }
                    N2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z12) {
            R1(arrayList, null, i10, i11, z10, z11);
        }
    }

    public static TL_iv.PageBlock M3(a aVar, t tVar) {
        int i10;
        if (A3(aVar.f49653b)) {
            ArrayList f32 = f3(aVar.f49653b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && f32 != null && i10 < f32.size()) {
                return (TL_iv.PageBlock) f32.get(i10);
            }
            return null;
        }
        return aVar.f49653b;
    }

    public static void N1(r3 r3Var) {
        if (r3Var.F3) {
            return;
        }
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.h();
        }
        r3Var.f50016e3.q();
        r3Var.n4();
    }

    public static void N2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i12 = 1;
            while (i11 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    R1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    M2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i12 = i13;
                }
                i12++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i11 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                R1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                M2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean N4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(x5.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!z5.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void O1(r3 r3Var, a aVar) {
        ArrayList arrayList = r3Var.f50024i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f49660k.addAll(aVar.f49660k);
        arrayList.add(indexOf + 1, aVar2);
        r3Var.r4();
        r3Var.V2.N(false);
        d2 d2Var2 = r3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        r3Var.post(new k2(r3Var, aVar2, 23));
    }

    public static FrameLayout O4(i5 i5Var, boolean z4) {
        int i10;
        l5 m9;
        z5 model = i5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z4) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : i5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z4 ? (z5.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z4 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m9 = i5Var.getGrid().m(pagetablecell)) != null) {
                return m9;
            }
        }
        return i5Var;
    }

    public static boolean P1(wh.r3 r16, wh.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.P1(wh.r3, wh.a, boolean):boolean");
    }

    public static List P3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (A3(aVar.f49653b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        t tVar = aVar.f49657g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static e1 Q3(View view) {
        if (view instanceof v5) {
            return ((v5) view).getEditText();
        }
        if (view instanceof j0) {
            return ((j0) view).getCaptionEditText();
        }
        if (view instanceof r0) {
            return ((r0) view).getEditText();
        }
        return null;
    }

    public static void R1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z4, boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.f49655e = z4;
        aVar.f49656f = z10;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock R3(TL_iv.PageBlock pageBlock) {
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

    public static t S3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z4;
        int i10;
        t tVar = new t();
        tVar.f50067b = photoEntry.isVideo;
        tVar.f50069e = str;
        tVar.f50073j = photoEntry.width;
        tVar.f50074k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = 0;
        } else {
            i10 = photoEntry.orientation;
        }
        tVar.f50075l = i10;
        if (!z4) {
            i11 = photoEntry.invert;
        }
        tVar.f50076m = i11;
        tVar.f50066a = 1;
        tVar.f50070f = 0.0f;
        return tVar;
    }

    public static i5 T2(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof i5) {
                return (i5) parent;
            }
        }
        return null;
    }

    public static void V2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new a(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        V2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f49658i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = n0.a();
                        V2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f49660k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    N2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList W2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        V2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Y1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] Z4(i5 i5Var) {
        int i10;
        int i11;
        z5 z5Var = i5Var.C;
        if (z5Var != null) {
            i10 = z5Var.f50264g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            e1 l10 = i5Var.l(i10);
            if (l10 != null) {
                i11 = l10.length();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                return new int[]{i10, i11};
            }
            i10--;
        }
        return null;
    }

    public static ArrayList f3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean g4(e1 e1Var, float f10, float f11) {
        if (e1Var != null && e1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            e1Var.getLocationOnScreen(iArr);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= e1Var.getWidth() && f13 <= e1Var.getHeight()) {
                int offsetForPosition = e1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                e1Var.s();
                e1Var.setSelection(Math.max(0, Math.min(offsetForPosition, e1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int j4(int i10, a aVar, boolean z4) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z4) {
            i11 = aVar.f49661l;
        } else {
            i11 = aVar.f49662m;
        }
        int size = aVar.f49660k.size() - i11;
        return org.telegram.messenger.y3.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean k3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !C3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int k4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f49660k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f49660k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z4) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                ((v5) childAt).setLocked(z4);
            } else if (childAt instanceof i5) {
                ((i5) childAt).setLocked(z4);
            } else if (childAt instanceof j0) {
                ((j0) childAt).getCaptionEditText().setLocked(z4);
            } else if (childAt instanceof r0) {
                ((r0) childAt).setLocked(z4);
            } else if (childAt instanceof v0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean u3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int v2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        if (i10 != 32768) {
            return 4;
        }
        return 16388;
    }

    public static boolean w3(a aVar) {
        if (aVar != null && (aVar.f49653b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || D3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !v5.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if (!D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public final ArrayList A2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f50024i3;
            if (i10 < arrayList2.size()) {
                for (t tVar : P3((a) arrayList2.get(i10))) {
                    if (tVar.b() && (photo = tVar.f50071g) != null && hashSet.add(Long.valueOf(photo.f20869id))) {
                        arrayList.add(tVar.f50071g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] A4() {
        int i10;
        ArrayList arrayList = this.f50024i3;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            int indexOf = arrayList.indexOf(x4(f3Var.f23177u0));
            int indexOf2 = arrayList.indexOf(x4(f3Var.f23180x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a P2 = P2();
        if (P2 != null) {
            i10 = arrayList.indexOf(P2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void B1() {
        p3 p3Var = this.f50016e3;
        if (p3Var != null) {
            p3Var.A();
        }
    }

    public final void B2() {
        d2 d2Var = this.G3;
        if (d2Var != null) {
            d2Var.h();
        }
        ArrayList arrayList = this.f50024i3;
        SpannableStringBuilder k10 = w4.k(arrayList);
        F2();
        arrayList.clear();
        HashMap hashMap = this.f50026j3;
        hashMap.clear();
        this.f50022h3 = null;
        V2(arrayList, w4.b(k10), hashMap);
        this.V2.N(false);
        d2 d2Var2 = this.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        p3 p3Var = this.f50016e3;
        if (p3Var != null) {
            p3Var.onContentChanged();
            p3Var.S();
        }
    }

    public final boolean B4() {
        int i10;
        int i11;
        int i12;
        int i13;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            if (K3()) {
                int i14 = f3Var.f23177u0;
                int i15 = f3Var.f23178v0;
                int i16 = f3Var.f23181y0;
                int i17 = f3Var.f23179w0;
                int i18 = f3Var.f23182z0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    e1 M4 = M4(i14, i19);
                    if (M4 != null) {
                        int length = M4.length();
                        if (i19 == i15) {
                            i12 = i17;
                        } else {
                            i12 = 0;
                        }
                        if (i19 == i16) {
                            i13 = i18;
                        } else {
                            i13 = length;
                        }
                        if (i15 == i16) {
                            i12 = Math.min(i17, i18);
                            i13 = Math.max(i17, i18);
                        }
                        if (Math.max(0, Math.min(i12, length)) < Math.max(0, Math.min(i13, length))) {
                            return true;
                        }
                    }
                }
            } else if (x3()) {
                e1 H2 = H2(f3Var.f23177u0);
                if (H2 != null && Math.max(0, Math.min(Math.min(f3Var.f23179w0, f3Var.f23182z0), H2.length())) < Math.max(0, Math.min(Math.max(f3Var.f23179w0, f3Var.f23182z0), H2.length()))) {
                    return true;
                }
            } else if (v3()) {
                e1 r22 = r2(f3Var.f23177u0);
                if (r22 != null) {
                    int i20 = f3Var.f23179w0;
                    int i21 = f3Var.f23182z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), r22.length())) < Math.max(0, Math.min(Math.max(i20, i21), r22.length()))) {
                        return true;
                    }
                }
            } else if (F3()) {
                e1 i42 = i4(f3Var.f23177u0);
                if (i42 != null) {
                    int i22 = f3Var.f23179w0;
                    int i23 = f3Var.f23182z0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), i42.length())) < Math.max(0, Math.min(Math.max(i22, i23), i42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = f3Var.f23177u0;
                int i25 = f3Var.f23180x0;
                int i26 = f3Var.f23179w0;
                int i27 = f3Var.f23182z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f50033m4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a x42 = x4(i28);
                        if (x42 != null) {
                            if (x42.f49669t == 0) {
                                TL_iv.PageBlock pageBlock = x42.f49653b;
                                if (!z3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int h22 = h2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = h22;
                            }
                            if (Math.max(0, Math.min(i10, h22)) < Math.max(0, Math.min(i11, h22))) {
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
    public final void C1() {
        p3 p3Var = this.f50016e3;
        if (p3Var != null) {
            p3Var.J();
        }
        w4();
    }

    public final a C2() {
        int i10;
        a x42;
        a P2 = P2();
        if (P2 != null) {
            return P2;
        }
        f3 f3Var = this.f50028k3;
        if (f3Var != null && (i10 = f3Var.f23177u0) >= 0 && (x42 = x4(i10)) != null) {
            return x42;
        }
        return null;
    }

    public final int[] C4() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23180x0;
            if (i10 >= 0 && i11 >= 0) {
                a x42 = x4(i10);
                a x43 = x4(i11);
                if (x42 != null && x43 != null) {
                    ArrayList arrayList = this.f50024i3;
                    int indexOf = arrayList.indexOf(x42);
                    int indexOf2 = arrayList.indexOf(x43);
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
    public final void D1(f2.m1 m1Var) {
        p3 p3Var = this.f50016e3;
        if (p3Var != null && m1Var != null) {
            View view = m1Var.f5875a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.Q3 = p3Var.b(view.getHeight() + iArr[1]);
        }
    }

    public final void D2() {
        ArrayList arrayList;
        f3 f3Var = this.f50028k3;
        int i10 = f3Var.f23177u0;
        int i11 = f3Var.f23179w0;
        int i12 = f3Var.f23180x0;
        if (!V1(i10, i11, i12, f3Var.f23182z0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f50024i3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f50033m4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f49669t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                d2 d2Var = this.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f50026j3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f49660k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                w2();
                U3();
                r4();
                f3Var.f(false);
                this.V2.N(false);
                d2 d2Var2 = this.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                post(new k2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void D4(e1 e1Var) {
        e1Var.adaptiveCreateLinkDialog = this.f50020g3;
        e1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void E1(f2.m1 m1Var) {
        a aVar = this.P3;
        this.P3 = null;
        this.Q3 = false;
        if (aVar != null) {
            d2 d2Var = this.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            q4(aVar);
            d2 d2Var2 = this.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            p3 p3Var = this.f50016e3;
            if (p3Var != null) {
                p3Var.onContentChanged();
            }
        } else if (m1Var != null) {
            View view = m1Var.f5875a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean E2() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            f3Var.f(false);
            return true;
        } else if (this.f50019f4 == null) {
            return false;
        } else {
            L2();
            return true;
        }
    }

    public final void E4(wh.i5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.E4(wh.i5):void");
    }

    @Override
    public final void F1(f2.m1 m1Var) {
        int b10;
        h51 G;
        a aVar = null;
        if (m1Var != null && (b10 = m1Var.b()) >= 0 && (G = this.V2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.P3 = aVar;
        this.Q3 = false;
        p3 p3Var = this.f50016e3;
        if (p3Var != null) {
            p3Var.u();
        }
    }

    public final void F2() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null) {
            f3Var.f(true);
        }
        L2();
        m3();
        IdentityHashMap identityHashMap = this.W3;
        for (u4 u4Var : identityHashMap.values()) {
            u4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.X3;
        for (q4 q4Var : identityHashMap2.values()) {
            q4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean F3() {
        int i10;
        a x42;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f23177u0) == f3Var.f23180x0 && i10 >= 0 && i10 < this.f50033m4.size() && f3Var.f23178v0 == 1 && f3Var.f23181y0 == 1 && (x42 = x4(i10)) != null && v5.p(x42.f49653b)) {
            return true;
        }
        return false;
    }

    public final v5 F4() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23180x0;
            a x42 = x4(i10);
            if (i10 == i11 && x42 != null && z3(x42.f49653b)) {
                return t2(i10);
            }
            return null;
        }
        return null;
    }

    public final int G2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f50024i3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (w3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f49658i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean G3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f50024i3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z4 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f49658i && !w3(aVar)) {
                        if (!aVar.f49660k.isEmpty() || v5.p(aVar.f49653b)) {
                            z4 = true;
                        }
                    }
                    i10++;
                }
                return z4;
            }
        }
        return false;
    }

    public final Editable G4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (w3(x4(i10))) {
                e1 H2 = H2(i10);
                if (H2 != null) {
                    return H2.getText();
                }
                return null;
            } else if (F3()) {
                e1 i42 = i4(i10);
                if (i42 != null) {
                    return i42.getText();
                }
                return null;
            } else {
                a x42 = x4(i10);
                if (x42 != null && z3(x42.f49653b)) {
                    int h22 = h2(i10);
                    if (w.c.k(i11, i13, h22, 0) < w.c.d(i11, i13, h22, 0)) {
                        v5 t22 = t2(i10);
                        if (t22 != null) {
                            return t22.getEditText().getText();
                        }
                        return v5.A(x42.f49653b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final e1 H2(int i10) {
        if (!w3(x4(i10))) {
            return null;
        }
        View z4 = z4(i10);
        if (!(z4 instanceof r0)) {
            return null;
        }
        return ((r0) z4).getEditText();
    }

    public final boolean H3() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23180x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z4 = false;
                while (i10 <= i11) {
                    a x42 = x4(i10);
                    if (x42 != null) {
                        if (B3(x42.f49653b)) {
                            z4 = true;
                        }
                    }
                    i10++;
                }
                return z4;
            }
        }
        return false;
    }

    public final boolean H4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.H4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean I3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.I3(int, int, int, int, int):boolean");
    }

    public final void I4(View view) {
        f2.m1 T;
        int b10;
        if (view != null && this.W2 != null && this.Z2 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.V2.H(b10) >= 0) {
            this.f50046x3 = true;
            f3 f3Var = this.f50028k3;
            if (f3Var.y()) {
                f3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.W2.r(T);
        }
    }

    public final boolean J3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z4 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            e1 M4 = M4(i11, i18);
            if (M4 != null) {
                int length = M4.length();
                if (i18 == i12) {
                    i16 = i13;
                } else {
                    i16 = 0;
                }
                if (i18 == i14) {
                    i17 = i15;
                } else {
                    i17 = length;
                }
                if (i12 == i14) {
                    i16 = Math.min(i13, i15);
                    i17 = Math.max(i13, i15);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else if ((M4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void J4(a aVar, t tVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f10;
        u4 u4Var = (u4) this.W3.remove(tVar);
        if (u4Var != null) {
            u4Var.b();
        }
        IdentityHashMap identityHashMap = this.X3;
        q4 q4Var = (q4) identityHashMap.remove(tVar);
        if (q4Var != null) {
            q4Var.a();
        }
        tVar.f50066a = 1;
        tVar.f50070f = 0.0f;
        q4 q4Var2 = new q4(this.c3, photoEntry, new d3(aVar, tVar, this));
        identityHashMap.put(tVar, q4Var2);
        if (!q4Var2.f49990f && !q4Var2.h && !q4Var2.f49991n) {
            q4Var2.f49990f = true;
            int i11 = photoEntry.width;
            int i12 = photoEntry.height;
            if (i11 <= 0 || i12 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(photoEntry.path, options);
                    i11 = options.outWidth;
                    i12 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            VideoEditedInfo videoEditedInfo = null;
            r7 = null;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
            videoEditedInfo = null;
            if (i11 > 0 && i12 > 0) {
                int i13 = photoEntry.orientation;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i12;
                    i12 = i11;
                    i11 = i14;
                }
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = (float) 0;
                videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
                while (true) {
                    long j10 = videoEditedInfo2.endTime;
                    i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i10 <= 0 || j10 >= 1000) {
                        break;
                    }
                    videoEditedInfo2.endTime = j10 * 2;
                }
                if (i10 <= 0) {
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
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        int i16 = i12;
                        i12 = i11;
                        i11 = i16;
                    }
                    i11 = (int) (i11 * cropState.cropPw);
                    i12 = (int) (i12 * cropState.cropPh);
                }
                float f11 = i11;
                float f12 = i12;
                float max = Math.max(f11 / 854.0f, f12 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i17 = (int) (f11 / max);
                int i18 = (int) (f12 / max);
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                if (i18 % 16 != 0) {
                    i18 = Math.max(1, Math.round(i18 / 16.0f)) * 16;
                }
                videoEditedInfo2.resultWidth = i17;
                videoEditedInfo2.originalWidth = i17;
                videoEditedInfo2.resultHeight = i18;
                videoEditedInfo2.originalHeight = i18;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.avatarStartTime = 0L;
                videoEditedInfo = videoEditedInfo2;
            }
            q4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20866id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                q4Var2.f49989e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(q4Var2.f49986a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                q4Var2.f49988c = messageObject;
                messageObject.videoEditedInfo = q4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(q4Var2.f49986a);
                notificationCenter.addObserver(q4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(q4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(q4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(q4Var2.f49988c, false, false, false);
                return;
            }
            q4Var2.b();
        }
    }

    public final boolean K3() {
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23180x0;
            a x42 = x4(i10);
            if (i10 == i11 && x42 != null && (x42.f49653b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K4(a aVar, t tVar, String str, boolean z4, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.W3;
        u4 u4Var = (u4) identityHashMap.remove(tVar);
        if (u4Var != null) {
            u4Var.b();
        }
        u4 u4Var2 = new u4(this.c3, str, z4, i10, i11, i12, new e3(aVar, tVar, this));
        identityHashMap.put(tVar, u4Var2);
        u4Var2.d();
    }

    public final void L2() {
        if (this.f50047y3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f50047y3 = false;
        this.f50048z3 = false;
        this.A3 = null;
        this.B3 = null;
        q70 q70Var = this.f50021g4;
        if (q70Var != null) {
            this.f50021g4 = null;
            q70Var.u();
        }
        i5 i5Var = this.f50019f4;
        if (i5Var != null) {
            LinkedHashSet linkedHashSet = i5Var.E;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                i5Var.v.invalidate();
                i5Var.t();
            }
            this.f50019f4 = null;
        }
        this.f50025i4 = -1;
        this.f50023h4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean L3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.c3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f50024i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += P3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Y2 = Y2();
        ?? obj = new Object();
        obj.d = i11;
        obj.f49756b = Y2.size() + obj.f49756b;
        for (int i12 = 0; i12 < Y2.size(); i12++) {
            e2.b((TL_iv.PageBlock) Y2.get(i12), 1, obj);
        }
        if (obj.f49755a > appGlobalConfig.richMessageLengthLimit.get() || obj.f49756b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f49757c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.f49758e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable L4(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof v5) {
            return ((v5) y12).getEditText().getText();
        }
        return v5.A(aVar.f49653b);
    }

    public final e1 M4(int i10, int i11) {
        View z4 = z4(i10);
        if (!(z4 instanceof i5)) {
            return null;
        }
        return ((i5) z4).l(i11);
    }

    public final int[] N3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.K3.size(); i12++) {
            int length = v5.z(((a) this.K3.get(i12)).f49653b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.K3.size() - 1;
        return new int[]{size, v5.z(((a) this.K3.get(size)).f49653b).length()};
    }

    public final e1 O2() {
        View findFocus = findFocus();
        if (findFocus instanceof e1) {
            return (e1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                return ((v5) childAt).getEditText();
            }
        }
        return null;
    }

    public final int O3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f50024i3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (w3(aVar)) {
                    i11++;
                } else if (aVar.f49658i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a P2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                if (v5Var.getEditText().isFocused() || (v5Var.n() && v5Var.h.isFocused())) {
                    return v5Var.getRow();
                }
            }
        }
        return null;
    }

    public final void P4() {
        boolean z4;
        int[] A4 = A4();
        if (A4 != null) {
            int i10 = A4[0];
            int i11 = A4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f50024i3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    d2 d2Var = this.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    if (G3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z10 = aVar.f49658i;
                            ArrayList arrayList2 = aVar.f49660k;
                            if (!z10 && !w3(aVar)) {
                                if (v5.p(aVar.f49653b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f49653b.text;
                                    aVar.f49653b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    android.support.v4.media.a.u(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = n0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z11 = aVar2.f49658i;
                            ArrayList arrayList3 = aVar2.f49660k;
                            if (!z11 && !w3(aVar2)) {
                                if (v5.p(aVar2.f49653b)) {
                                    long a10 = n0.a();
                                    TL_iv.RichText k10 = v5.k(aVar2.f49653b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f50026j3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f49653b.text;
                                    aVar2.f49653b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    w2();
                    U3();
                    r4();
                    f3 f3Var = this.f50028k3;
                    if (f3Var != null && f3Var.y()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.V2.N(false);
                    d2 d2Var2 = this.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    if (z4) {
                        post(new uf.h1(this, aVar3, aVar4, 11));
                    } else {
                        post(new k2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void Q1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.Q1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final i5 Q2() {
        View findFocus = findFocus();
        if (findFocus instanceof e1) {
            return T2((e1) findFocus);
        }
        return null;
    }

    public final void Q4(wh.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.Q4(wh.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document R2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        TLRPC.Document document2 = null;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f50024i3.size(); i12++) {
            for (t tVar : P3((a) this.f50024i3.get(i12))) {
                if (tVar != null && (document = tVar.h) != null && document.f20851id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f50022h3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f20851id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = p4.f49963a;
        synchronized (p4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) p4.f49964b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean R4() {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.R4():boolean");
    }

    public final void S1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        r3 r3Var;
        if (aVar != null && C3(aVar.f49653b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                d2 d2Var = this.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                t S3 = S3(photoEntry, str2);
                boolean c3 = q4.c(photoEntry);
                if (!photoEntry.isVideo && !c3) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (A3(aVar.f49653b)) {
                    f3(aVar.f49653b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(S3);
                } else {
                    t tVar = aVar.f49657g;
                    if (tVar != null && tVar.f50066a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f49653b.caption;
                        i0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f49653b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f49657g);
                        aVar.h.add(S3);
                        aVar.f49657g = null;
                        aVar.f49653b = pageblockcollage;
                    } else {
                        aVar.f49653b = pageblockvideo;
                        aVar.f49657g = S3;
                    }
                }
                this.V2.N(false);
                m4(aVar);
                if (c3) {
                    J4(aVar, S3, photoEntry);
                    r3Var = this;
                } else {
                    r3Var = this;
                    r3Var.K4(aVar, S3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                d2 d2Var2 = r3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                r3Var.f50016e3.onContentChanged();
            }
        }
    }

    public final int S2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f50024i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f49658i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (w3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f49653b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f49658i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f49653b;
                    if (!D3(pageBlock) || k3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean S4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.S4(android.view.View, float, float):boolean");
    }

    public final void T1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            d2 d2Var = this.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f50022h3;
            if (richMessage2 == null) {
                this.f50022h3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f50022h3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            V2(arrayList4, richMessage.blocks, this.f50026j3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    u4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f50024i3;
                int size = arrayList5.size();
                a P2 = P2();
                if (P2 != null && (indexOf = arrayList5.indexOf(P2)) >= 0) {
                    TL_iv.PageBlock pageBlock = P2.f49653b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && v5.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                U3();
                r4();
                this.V2.N(false);
                d2 d2Var2 = this.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                p3 p3Var = this.f50016e3;
                if (p3Var != null) {
                    p3Var.onContentChanged();
                }
            }
        }
    }

    public final a T3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f50033m4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f49658i) {
                    if (aVar.f49669t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f49653b;
                        if (D3(pageBlock) && !k3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i10 += i11;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void T4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        Editable A;
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f50024i3;
            if (arrayList.indexOf(aVar2) >= 0 && !w3(aVar2) && !aVar2.f49658i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f49653b;
                if (pageBlock != pageBlock2 && z3(pageBlock2) && z3(pageBlock)) {
                    v5 t22 = t2(arrayList.indexOf(aVar2));
                    if (t22 != null) {
                        A = t22.getEditText().getText();
                    } else {
                        A = v5.A(aVar2.f49653b);
                    }
                    v5.d(pageBlock, A);
                    TL_iv.RichText k10 = v5.k(aVar2.f49653b);
                    if (k10 != null && v5.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                Q4(aVar2, pageBlock, i10, i11, z4, z10);
            }
        }
    }

    public final a U1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f50033m4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f49669t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void U2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                v5Var.f50150f.n();
                v5Var.h.n();
            } else if (childAt instanceof j0) {
                ((j0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof r0) {
                ((r0) childAt).getEditText().n();
            }
        }
    }

    public final void U3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50024i3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f49660k.isEmpty() && v5.p(aVar.f49653b)) {
                    long a2 = n0.a();
                    TL_iv.RichText k10 = v5.k(aVar.f49653b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f50026j3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f49660k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f49653b.text;
                    aVar.f49653b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        T4(aVar2, pageBlock, aVar2.f49654c, aVar2.d, aVar2.f49655e, aVar2.f49656f);
    }

    public final boolean V1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.V1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean V3(wh.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.V3(wh.a, boolean):boolean");
    }

    public final void V4(a aVar, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            T4(aVar2, aVar2.f49653b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f49654c);
        if (i10 == 2) {
            i11 = Math.max(1, aVar2.d);
        } else {
            i11 = 0;
        }
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        TL_iv.PageBlock pageBlock = aVar2.f49653b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z4 && aVar2.f49656f) {
            z10 = true;
        } else {
            z10 = false;
        }
        T4(aVar2, pageBlock, max, i11, z4, z10);
    }

    public final void W1() {
        v5 v5Var;
        a aVar;
        s5 s5Var;
        this.V2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v5) && (aVar = (v5Var = (v5) childAt).f50155x) != null && (s5Var = v5Var.f50156y) != null) {
                v5Var.g(aVar, s5Var, v5Var.B);
            }
        }
    }

    public final void W3() {
        int length;
        int k10;
        int d;
        int length2;
        int k11;
        int d10;
        int length3;
        int k12;
        int d11;
        int length4;
        int k13;
        int d12;
        e1 M4;
        int length5;
        int k14;
        int d13;
        boolean K3 = K3();
        f3 f3Var = this.f50028k3;
        if (K3) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23178v0;
            if (i11 == f3Var.f23181y0 && (M4 = M4(i10, i11)) != null && (k14 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length5 = M4.length()), 0)) < (d13 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length5, 0))) {
                d2 d2Var = this.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                if (x5.h(M4.getText(), k14, d13)) {
                    x5.n(M4.getText(), k14, d13);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    d2 d2Var2 = this.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    n4();
                }
                M4.setSelectionOverride(k14, d13);
                M4.makeSelectedDate();
            }
        } else if (x3()) {
            int i12 = f3Var.f23177u0;
            e1 H2 = H2(i12);
            if (H2 != null && (k13 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length4 = H2.length()), 0)) < (d12 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length4, 0))) {
                d2 d2Var3 = this.G3;
                if (d2Var3 != null) {
                    d2Var3.d();
                }
                if (x5.h(H2.getText(), k13, d12)) {
                    x5.n(H2.getText(), k13, d12);
                    H2.invalidateEffects();
                    d4(i12);
                    d2 d2Var4 = this.G3;
                    if (d2Var4 != null) {
                        d2Var4.h();
                    }
                    n4();
                }
                H2.setSelectionOverride(k13, d12);
                H2.makeSelectedDate();
            }
        } else if (v3()) {
            int i13 = f3Var.f23177u0;
            e1 r22 = r2(i13);
            if (r22 != null && (k12 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length3 = r22.length()), 0)) < (d11 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length3, 0))) {
                d2 d2Var5 = this.G3;
                if (d2Var5 != null) {
                    d2Var5.d();
                }
                if (x5.h(r22.getText(), k12, d11)) {
                    x5.n(r22.getText(), k12, d11);
                    r22.invalidateEffects();
                    c4(i13);
                    d2 d2Var6 = this.G3;
                    if (d2Var6 != null) {
                        d2Var6.h();
                    }
                    n4();
                }
                r22.setSelectionOverride(k12, d11);
                r22.makeSelectedDate();
            }
        } else if (F3()) {
            int i14 = f3Var.f23177u0;
            e1 i42 = i4(i14);
            if (i42 != null && (k11 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length2 = i42.length()), 0)) < (d10 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length2, 0))) {
                d2 d2Var7 = this.G3;
                if (d2Var7 != null) {
                    d2Var7.d();
                }
                if (x5.h(i42.getText(), k11, d10)) {
                    x5.n(i42.getText(), k11, d10);
                    i42.invalidateEffects();
                    e4(i14);
                    d2 d2Var8 = this.G3;
                    if (d2Var8 != null) {
                        d2Var8.h();
                    }
                    n4();
                }
                i42.setSelectionOverride(k11, d10);
                i42.makeSelectedDate();
            }
        } else {
            v5 F4 = F4();
            if (F4 == null || (k10 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length = F4.getEditText().length()), 0)) >= (d = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length, 0))) {
                return;
            }
            d2 d2Var9 = this.G3;
            if (d2Var9 != null) {
                d2Var9.d();
            }
            if (x5.h(F4.getEditText().getText(), k10, d)) {
                x5.n(F4.getEditText().getText(), k10, d);
                F4.getEditText().invalidateEffects();
                F4.x();
                d2 d2Var10 = this.G3;
                if (d2Var10 != null) {
                    d2Var10.h();
                }
                n4();
            }
            F4.getEditText().setSelectionOverride(k10, d);
            F4.getEditText().makeSelectedDate();
        }
    }

    public final a W4() {
        f3 f3Var;
        int i10;
        a P2 = P2();
        if (P2 == null && (f3Var = this.f50028k3) != null && f3Var.y() && (i10 = f3Var.f23177u0) == f3Var.f23180x0) {
            return x4(i10);
        }
        return P2;
    }

    public final boolean X1(int i10, int i11) {
        f3 f3Var;
        ArrayList arrayList = this.K3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] N3 = N3(max);
            int[] N32 = N3(max2);
            a aVar = (a) this.K3.get(N3[0]);
            if (N3[0] != N32[0] && max != max2) {
                View y12 = y1(aVar);
                View y13 = y1(this.K3.get(N32[0]));
                if ((y12 instanceof v5) && (y13 instanceof v5)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f50024i3;
                        int size = arrayList2.size();
                        f3Var = this.f50028k3;
                        if (i12 >= size) {
                            break;
                        }
                        f3Var.Y(i12, v5.z(((a) arrayList2.get(i12)).f49653b));
                        i12++;
                    }
                    v5 v5Var = (v5) y12;
                    int length = v5Var.getEditText().length();
                    if (N3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!f3Var.k0(v5Var, 0, N3[1], length)) {
                        v5Var.B();
                        return true;
                    }
                    f3Var.c0(0, N32[1], (v5) y13);
                    return true;
                }
            } else {
                View y14 = y1(aVar);
                if (y14 instanceof v5) {
                    v5 v5Var2 = (v5) y14;
                    v5Var2.B();
                    e1 editText = v5Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(N3[1], length2), Math.min(N32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList X2(int i10, int i11, int i12, boolean z4) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z10;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f50024i3;
            a aVar = (a) arrayList2.get(i15);
            boolean z11 = aVar.f49658i;
            ArrayList arrayList3 = aVar.f49660k;
            if (z11) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l10 = (Long) arrayList3.get(i12);
                long longValue = l10.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f49660k.size() <= i12 || ((Long) aVar2.f49660k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> X2 = X2(i15, i16, i12 + 1, true);
                if (X2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f50026j3.get(l10);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (X2.size() == 1 && (X2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (X2.get(0).text != null) {
                            textempty = X2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = X2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (w3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f49653b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int O3 = O3(i15);
                pageblockdetails.blocks = X2(i15 + 1, Math.min(O3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = O3 + 1;
            } else {
                int i17 = aVar.f49654c;
                if (i17 <= 0) {
                    I2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock j22 = j2(i15, i17, i13, i14, z10, iArr);
                    if (j22 != null) {
                        arrayList.add(j22);
                    }
                    int i18 = iArr[0];
                    if (i18 <= 0) {
                        i15 = i13;
                    } else {
                        i15 = i18;
                    }
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z4) {
            while (!arrayList.isEmpty() && y3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && y3((TL_iv.PageBlock) l.d.i(1, arrayList))) {
                android.support.v4.media.a.u(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void X3(int i10) {
        int i11;
        d2 d2Var;
        int i12;
        boolean z4;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int k10;
        int d;
        boolean z10;
        int i16;
        int length2;
        int k11;
        int d10;
        boolean z11;
        int i17;
        int length3;
        int k12;
        int d11;
        boolean z12;
        int i18;
        d2 d2Var2;
        int i19;
        int i20;
        int i21;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            boolean K3 = K3();
            p3 p3Var = this.f50016e3;
            int i22 = 0;
            if (K3) {
                int i23 = f3Var.f23177u0;
                int i24 = f3Var.f23178v0;
                int i25 = f3Var.f23181y0;
                int i26 = f3Var.f23179w0;
                int i27 = f3Var.f23182z0;
                boolean J3 = J3(i10, i23, i24, i26, i25, i27);
                if (!J3) {
                    i18 = v2(i10);
                } else {
                    i18 = 0;
                }
                d2 d2Var3 = this.G3;
                if (d2Var3 != null) {
                    d2Var3.d();
                }
                this.F3 = true;
                int i28 = i24;
                boolean z13 = false;
                while (i28 <= i25) {
                    e1 M4 = M4(i23, i28);
                    if (M4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = M4.length();
                        if (i28 == i24) {
                            i19 = i26;
                        } else {
                            i19 = 0;
                        }
                        if (i28 == i25) {
                            i20 = i27;
                        } else {
                            i20 = length4;
                        }
                        if (i24 == i25) {
                            i19 = Math.min(i26, i27);
                            i20 = Math.max(i26, i27);
                        }
                        int i29 = i19;
                        i21 = i24;
                        int max = Math.max(0, Math.min(i29, length4));
                        int max2 = Math.max(0, Math.min(i20, length4));
                        if (max < max2) {
                            if (!J3) {
                                if (i18 != 0) {
                                    M4.removeStyle(i18, max, max2);
                                }
                                M4.addStyle(i10, max, max2);
                            } else {
                                M4.removeStyle(i10, max, max2);
                            }
                            M4.invalidateEffects();
                            M4.requestLayout();
                            f4(i23, i28);
                            z13 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.F3 = false;
                if (z13 && (d2Var2 = this.G3) != null) {
                    d2Var2.h();
                }
                p3Var.q();
                if (z13) {
                    n4();
                }
            } else if (x3()) {
                int i30 = f3Var.f23177u0;
                e1 H2 = H2(i30);
                if (H2 != null && (k12 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length3 = H2.length()), 0)) < (d11 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length3, 0))) {
                    if ((H2.getCurrentStyle(k12, d11) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d2 d2Var4 = this.G3;
                    if (d2Var4 != null) {
                        d2Var4.d();
                    }
                    this.F3 = true;
                    if (z12) {
                        int v22 = v2(i10);
                        if (v22 != 0) {
                            H2.removeStyle(v22, k12, d11);
                        }
                        H2.addStyle(i10, k12, d11);
                    } else {
                        H2.removeStyle(i10, k12, d11);
                    }
                    this.F3 = false;
                    d4(i30);
                    H2.invalidateEffects();
                    H2.requestLayout();
                    d2 d2Var5 = this.G3;
                    if (d2Var5 != null) {
                        d2Var5.h();
                    }
                    p3Var.q();
                    n4();
                }
            } else if (v3()) {
                int i31 = f3Var.f23177u0;
                e1 r22 = r2(i31);
                if (r22 != null && (k11 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length2 = r22.length()), 0)) < (d10 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length2, 0))) {
                    if ((r22.getCurrentStyle(k11, d10) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i17 = v2(i10);
                    } else {
                        i17 = 0;
                    }
                    d2 d2Var6 = this.G3;
                    if (d2Var6 != null) {
                        d2Var6.d();
                    }
                    this.F3 = true;
                    if (z11) {
                        if (i17 != 0) {
                            r22.removeStyle(i17, k11, d10);
                        }
                        r22.addStyle(i10, k11, d10);
                    } else {
                        r22.removeStyle(i10, k11, d10);
                    }
                    r22.invalidateEffects();
                    r22.requestLayout();
                    c4(i31);
                    this.F3 = false;
                    d2 d2Var7 = this.G3;
                    if (d2Var7 != null) {
                        d2Var7.h();
                    }
                    p3Var.q();
                    n4();
                }
            } else if (F3()) {
                int i32 = f3Var.f23177u0;
                e1 i42 = i4(i32);
                if (i42 != null && (k10 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length = i42.length()), 0)) < (d = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length, 0))) {
                    if ((i42.getCurrentStyle(k10, d) & i10) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i16 = v2(i10);
                    } else {
                        i16 = 0;
                    }
                    d2 d2Var8 = this.G3;
                    if (d2Var8 != null) {
                        d2Var8.d();
                    }
                    this.F3 = true;
                    if (z10) {
                        if (i16 != 0) {
                            i42.removeStyle(i16, k10, d);
                        }
                        i42.addStyle(i10, k10, d);
                    } else {
                        i42.removeStyle(i10, k10, d);
                    }
                    i42.invalidateEffects();
                    i42.requestLayout();
                    e4(i32);
                    this.F3 = false;
                    d2 d2Var9 = this.G3;
                    if (d2Var9 != null) {
                        d2Var9.h();
                    }
                    p3Var.q();
                    n4();
                }
            } else {
                int i33 = f3Var.f23177u0;
                int i34 = f3Var.f23180x0;
                int i35 = f3Var.f23179w0;
                int i36 = f3Var.f23182z0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f50033m4.size()) {
                    int i37 = i10;
                    boolean I3 = I3(i37, i33, i35, i34, i36);
                    boolean z14 = !I3;
                    if (!I3) {
                        i11 = v2(i37);
                    } else {
                        i11 = 0;
                    }
                    d2 d2Var10 = this.G3;
                    if (d2Var10 != null) {
                        d2Var10.d();
                    }
                    this.F3 = true;
                    int i38 = i33;
                    boolean z15 = false;
                    while (i38 <= i34) {
                        a x42 = x4(i38);
                        if (x42 != null) {
                            TL_iv.PageBlock pageBlock = x42.f49653b;
                            if (z3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int h22 = h2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = 0;
                                }
                                z4 = z15;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = h22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, h22));
                                int max4 = Math.max(i22, Math.min(i14, h22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z15 = z4;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    v5 t22 = t2(i38);
                                    if (t22 != null) {
                                        org.telegram.ui.ActionBar.y4 styleDelegate = t22.getStyleDelegate();
                                        if (!I3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        t22.getEditText().invalidateEffects();
                                        t22.getEditText().requestLayout();
                                        t22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(v5.A(x42.f49653b));
                                        if (!I3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            x5.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        x5.o(spannableStringBuilder, i15, max4, i37, z14, null);
                                        v5.d(x42.f49653b, spannableStringBuilder);
                                    }
                                    z15 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z4 = z15;
                        z15 = z4;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z16 = z15;
                    this.F3 = false;
                    if (z16 && (d2Var = this.G3) != null) {
                        d2Var.h();
                    }
                    p3Var.q();
                    if (z16) {
                        n4();
                    }
                }
            }
        }
    }

    public final void X4(float f10, float f11) {
        TL_iv.pageTableCell m9;
        i5 i5Var = this.f50019f4;
        if (this.f50047y3 && i5Var != null && this.f50043u3 == i5Var && (m9 = i5Var.m((int) ((f10 - i5Var.getLeft()) - getLeft()), (int) ((f11 - i5Var.getTop()) - getTop()))) != null && m9 != this.B3) {
            this.B3 = m9;
            i5Var.w(this.A3, m9);
        }
    }

    public final ArrayList Y2() {
        return X2(0, this.f50024i3.size(), 0, false);
    }

    public final void Y3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.Y3(android.view.View):void");
    }

    public final void Y4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    d2 d2Var = this.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    v5 t22 = t2(this.f50024i3.indexOf(aVar));
                    if (t22 != null && (aVar2 = t22.f50155x) != null) {
                        t22.I(aVar2.f49653b, true);
                        t22.E = null;
                        t22.C();
                    }
                    d2 d2Var2 = this.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                }
            }
        }
    }

    public final void Z1() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.f50024i3;
            if (i11 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i11);
                ArrayList arrayList7 = aVar.f49659j;
                ArrayList arrayList8 = aVar.f49660k;
                arrayList7.clear();
                if (aVar.f49658i) {
                    if (!arrayList.isEmpty()) {
                        android.support.v4.media.a.u(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                        ((Long) arrayList8.get(i12)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        arrayList7.add((n0) arrayList.get(i13));
                    }
                    int max = Math.max(i10, aVar.f49654c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        for (int i14 = 1; i14 <= max; i14++) {
                            int i15 = i14 - 1;
                            if (i14 == max) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i15 < arrayList2.size()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && z10) {
                                if (((Boolean) arrayList3.get(i15)).booleanValue() != z4) {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                while (arrayList2.size() > i15) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(n0.a()));
                                if (z10) {
                                    z13 = z4;
                                } else {
                                    z13 = false;
                                }
                                arrayList3.add(Boolean.valueOf(z13));
                                arrayList4.add(0);
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i15)).getClass();
                            if (z10) {
                                if (((Long) arrayList5.get(i15)).longValue() != 0 && D3(aVar.f49653b)) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (z12) {
                                    arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                    arrayList5.set(i15, Long.valueOf(aVar.f49652a));
                                } else {
                                    ((Integer) arrayList4.get(i15)).getClass();
                                    ((Long) arrayList5.get(i15)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i15)).getClass();
                                arrayList7.add(new Object());
                            }
                        }
                    }
                    if (w3(aVar)) {
                        boolean z14 = ((TL_iv.pageBlockDetails) aVar.f49653b).open;
                        n0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (v5.p(aVar.f49653b)) {
                        n0.a();
                        arrayList7.add(new Object());
                    }
                }
                i11++;
                i10 = 0;
            } else {
                return;
            }
        }
    }

    public final boolean Z2() {
        a aVar;
        ArrayList arrayList = this.f50024i3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) l.d.i(1, arrayList);
        }
        if (aVar != null && !D3(aVar.f49653b) && !aVar.f49658i && !w3(aVar) && !J2(aVar.f49653b)) {
            if (!(y1(aVar) instanceof v5)) {
                return false;
            }
            d3(aVar);
            return true;
        }
        d2 d2Var = this.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.V2.N(false);
        d2 d2Var2 = this.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        post(new k2(this, aVar2, 21));
        return true;
    }

    public final void Z3() {
        int length;
        int k10;
        int d;
        int length2;
        int k11;
        int d10;
        int length3;
        int k12;
        int d11;
        int length4;
        int k13;
        int d12;
        e1 M4;
        int length5;
        int k14;
        int d13;
        boolean K3 = K3();
        p3 p3Var = this.f50016e3;
        f3 f3Var = this.f50028k3;
        if (K3) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23178v0;
            if (i11 == f3Var.f23181y0 && (M4 = M4(i10, i11)) != null && (k14 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length5 = M4.length()), 0)) < (d13 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length5, 0))) {
                if (x5.h(M4.getText(), k14, d13)) {
                    d2 d2Var = this.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    x5.n(M4.getText(), k14, d13);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    d2 d2Var2 = this.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    p3Var.q();
                    n4();
                    return;
                }
                d2 d2Var3 = this.G3;
                if (d2Var3 != null) {
                    d2Var3.d();
                }
                if (x5.g(M4.getText(), k14, d13)) {
                    x5.m(M4.getText(), k14, d13);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    d2 d2Var4 = this.G3;
                    if (d2Var4 != null) {
                        d2Var4.h();
                    }
                    n4();
                }
                M4.setSelectionOverride(k14, d13);
                n3(false);
                D4(M4);
            }
        } else if (x3()) {
            int i12 = f3Var.f23177u0;
            e1 H2 = H2(i12);
            if (H2 != null && (k13 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length4 = H2.length()), 0)) < (d12 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length4, 0))) {
                if (x5.h(H2.getText(), k13, d12)) {
                    d2 d2Var5 = this.G3;
                    if (d2Var5 != null) {
                        d2Var5.d();
                    }
                    x5.n(H2.getText(), k13, d12);
                    H2.invalidateEffects();
                    d4(i12);
                    d2 d2Var6 = this.G3;
                    if (d2Var6 != null) {
                        d2Var6.h();
                    }
                    p3Var.q();
                    n4();
                    return;
                }
                d2 d2Var7 = this.G3;
                if (d2Var7 != null) {
                    d2Var7.d();
                }
                if (x5.g(H2.getText(), k13, d12)) {
                    x5.m(H2.getText(), k13, d12);
                    H2.invalidateEffects();
                    d4(i12);
                    d2 d2Var8 = this.G3;
                    if (d2Var8 != null) {
                        d2Var8.h();
                    }
                    n4();
                }
                H2.setSelectionOverride(k13, d12);
                n3(false);
                D4(H2);
            }
        } else if (v3()) {
            int i13 = f3Var.f23177u0;
            e1 r22 = r2(i13);
            if (r22 != null && (k12 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length3 = r22.length()), 0)) < (d11 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length3, 0))) {
                if (x5.h(r22.getText(), k12, d11)) {
                    d2 d2Var9 = this.G3;
                    if (d2Var9 != null) {
                        d2Var9.d();
                    }
                    x5.n(r22.getText(), k12, d11);
                    r22.invalidateEffects();
                    c4(i13);
                    d2 d2Var10 = this.G3;
                    if (d2Var10 != null) {
                        d2Var10.h();
                    }
                    p3Var.q();
                    n4();
                    return;
                }
                d2 d2Var11 = this.G3;
                if (d2Var11 != null) {
                    d2Var11.d();
                }
                if (x5.g(r22.getText(), k12, d11)) {
                    x5.m(r22.getText(), k12, d11);
                    r22.invalidateEffects();
                    c4(i13);
                    d2 d2Var12 = this.G3;
                    if (d2Var12 != null) {
                        d2Var12.h();
                    }
                    n4();
                }
                r22.setSelectionOverride(k12, d11);
                n3(false);
                D4(r22);
            }
        } else if (F3()) {
            int i14 = f3Var.f23177u0;
            e1 i42 = i4(i14);
            if (i42 != null && (k11 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length2 = i42.length()), 0)) < (d10 = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length2, 0))) {
                if (x5.h(i42.getText(), k11, d10)) {
                    d2 d2Var13 = this.G3;
                    if (d2Var13 != null) {
                        d2Var13.d();
                    }
                    x5.n(i42.getText(), k11, d10);
                    i42.invalidateEffects();
                    e4(i14);
                    d2 d2Var14 = this.G3;
                    if (d2Var14 != null) {
                        d2Var14.h();
                    }
                    p3Var.q();
                    n4();
                    return;
                }
                d2 d2Var15 = this.G3;
                if (d2Var15 != null) {
                    d2Var15.d();
                }
                if (x5.g(i42.getText(), k11, d10)) {
                    x5.m(i42.getText(), k11, d10);
                    i42.invalidateEffects();
                    e4(i14);
                    d2 d2Var16 = this.G3;
                    if (d2Var16 != null) {
                        d2Var16.h();
                    }
                    n4();
                }
                i42.setSelectionOverride(k11, d10);
                n3(false);
                D4(i42);
            }
        } else {
            v5 F4 = F4();
            if (F4 == null || (k10 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length = F4.getEditText().length()), 0)) >= (d = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length, 0))) {
                return;
            }
            if (x5.h(F4.getEditText().getText(), k10, d)) {
                d2 d2Var17 = this.G3;
                if (d2Var17 != null) {
                    d2Var17.d();
                }
                x5.n(F4.getEditText().getText(), k10, d);
                F4.getEditText().invalidateEffects();
                F4.x();
                d2 d2Var18 = this.G3;
                if (d2Var18 != null) {
                    d2Var18.h();
                }
                p3Var.q();
                n4();
                return;
            }
            d2 d2Var19 = this.G3;
            if (d2Var19 != null) {
                d2Var19.d();
            }
            if (x5.g(F4.getEditText().getText(), k10, d)) {
                x5.m(F4.getEditText().getText(), k10, d);
                F4.getEditText().invalidateEffects();
                F4.x();
                d2 d2Var20 = this.G3;
                if (d2Var20 != null) {
                    d2Var20.h();
                }
                n4();
            }
            F4.getEditText().setSelectionOverride(k10, d);
            n3(false);
            D4(F4.getEditText());
        }
    }

    public final void a2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            d2 d2Var = this.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z4 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            t tVar = new t();
            aVar.f49657g = tVar;
            tVar.f50068c = true;
            long j10 = document.f20851id;
            z4 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z4) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                t tVar2 = aVar.f49657g;
                tVar2.f50072i = document;
                tVar2.f50069e = str;
                tVar2.f50066a = 1;
                tVar2.f50070f = 0.0f;
            } else {
                tVar.h = document;
                tVar.f50072i = document;
                tVar.f50066a = 2;
                pageblockaudio.audio_id = j10;
            }
            t3(aVar);
            if (z4) {
                t tVar3 = aVar.f49657g;
                String str2 = tVar3.f50069e;
                IdentityHashMap identityHashMap = this.W3;
                u4 u4Var = (u4) identityHashMap.remove(tVar3);
                if (u4Var != null) {
                    u4Var.b();
                }
                u4 u4Var2 = new u4(this.c3, str2, document, new c3(aVar, tVar3, this));
                identityHashMap.put(tVar3, u4Var2);
                u4Var2.d();
            }
            d2 d2Var2 = this.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            this.f50016e3.onContentChanged();
        }
    }

    public final void a3(a aVar, boolean z4) {
        int i10;
        View y12 = y1(aVar);
        if (y12 instanceof a5) {
            e1 e1Var = ((a5) y12).f49681r;
            e1Var.r();
            if (z4) {
                i10 = e1Var.length();
            } else {
                i10 = 0;
            }
            e1Var.setSelection(i10);
            return;
        }
        b3(aVar, z4);
    }

    public final void a4() {
        e1 editText;
        Runnable g2Var;
        int length;
        final int k10;
        final int d;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            if (K3()) {
                int i10 = f3Var.f23177u0;
                int i11 = f3Var.f23178v0;
                if (i11 == f3Var.f23181y0) {
                    editText = M4(i10, i11);
                    g2Var = new l2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (x3()) {
                int i12 = f3Var.f23177u0;
                editText = H2(i12);
                g2Var = new f2(this, i12, 3);
            } else if (v3()) {
                int i13 = f3Var.f23177u0;
                editText = r2(i13);
                g2Var = new f2(this, i13, 0);
            } else if (F3()) {
                int i14 = f3Var.f23177u0;
                editText = i4(i14);
                g2Var = new f2(this, i14, 1);
            } else {
                v5 F4 = F4();
                if (F4 != null) {
                    editText = F4.getEditText();
                    g2Var = new g2(F4, 0);
                } else {
                    return;
                }
            }
            final e1 e1Var = editText;
            final Runnable runnable = g2Var;
            if (e1Var != null && (k10 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length = e1Var.length()), 0)) <= (d = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length, 0))) {
                Editable text = e1Var.getText();
                int i15 = s.h;
                String str = null;
                if (text != null) {
                    s[] sVarArr = (s[]) text.getSpans(k10, d, s.class);
                    if (sVarArr.length > 0) {
                        str = sVarArr[0].f50055a;
                    }
                }
                if (str == null) {
                    str = e1Var.getText().subSequence(k10, d).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = k6.G6;
                g6 g6Var = this.f50014d3;
                final int v02 = k6.v0(i16, g6Var);
                q.U(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        s a2;
                        String str2 = (String) obj;
                        r3 r3Var = r3.this;
                        r3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = s.a(str2, v02, dp)) == null) {
                            return;
                        }
                        d2 d2Var = r3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        f3 f3Var2 = r3Var.f50028k3;
                        if (f3Var2 != null) {
                            f3Var2.f(false);
                        }
                        e1 e1Var2 = e1Var;
                        e1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = e1Var2.getText();
                        int max = Math.max(0, Math.min(k10, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(d, text2.length())), spannableString);
                        runnable.run();
                        d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        r3Var.f50016e3.onContentChanged();
                        int min = Math.min(max + 1, e1Var2.length());
                        e1Var2.r();
                        r3Var.post(new r2(e1Var2, min, 3));
                    }
                }, g6Var);
            }
        }
    }

    public final void a5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.a5(java.lang.CharSequence):void");
    }

    public final void b2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f20851id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
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
            c2(tL_document, str);
        }
    }

    public final void b3(a aVar, boolean z4) {
        View y12 = y1(aVar);
        if (y12 instanceof i5) {
            i5 i5Var = (i5) y12;
            e1 e1Var = i5Var.f49834r;
            z5 z5Var = i5Var.C;
            if (z5Var != null) {
                if (!z4) {
                    e1Var.r();
                    e1Var.setSelection(0);
                    return;
                } else if (!z5Var.f50264g.isEmpty()) {
                    l5 m9 = i5Var.v.m((TL_iv.pageTableCell) l.d.i(1, i5Var.C.f50264g));
                    if (m9 != null) {
                        e1 e1Var2 = m9.f49903a;
                        e1Var2.r();
                        e1Var2.setSelection(e1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z4 && (y12 instanceof v5)) {
            v5 v5Var = (v5) y12;
            if (v5Var.n()) {
                v5Var.i();
                return;
            }
        }
        e1 Q3 = Q3(y12);
        if (Q3 == null) {
            c3(aVar);
            return;
        }
        Q3.r();
        if (z4) {
            Q3.setSelection(Q3.length());
        }
    }

    public final void b4() {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.b4():void");
    }

    public final void c2(TLRPC.Document document, String str) {
        if (document != null) {
            d2 d2Var = this.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z4 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            t tVar = new t();
            aVar.f49657g = tVar;
            tVar.d = true;
            long j10 = document.f20851id;
            z4 = (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z4) {
                if (!TextUtils.isEmpty(str) && e2.c.t(str)) {
                    t tVar2 = aVar.f49657g;
                    tVar2.h = document;
                    tVar2.f50069e = str;
                    tVar2.f50066a = 1;
                    tVar2.f50070f = 0.0f;
                } else {
                    return;
                }
            } else {
                tVar.h = document;
                tVar.f50066a = 2;
                pageblockdocument.document_id = j10;
            }
            t3(aVar);
            if (z4) {
                t tVar3 = aVar.f49657g;
                IdentityHashMap identityHashMap = this.W3;
                u4 u4Var = (u4) identityHashMap.remove(tVar3);
                if (u4Var != null) {
                    u4Var.b();
                }
                u4 u4Var2 = new u4(this.c3, str, document, new b3(this, tVar3, aVar, str));
                identityHashMap.put(tVar3, u4Var2);
                u4Var2.d();
            }
            d2 d2Var2 = this.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            this.f50016e3.onContentChanged();
        }
    }

    public final void c3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof v5) {
            ((v5) y12).B();
        } else if (y12 instanceof r0) {
            ((r0) y12).d.r();
        }
    }

    public final void c4(int i10) {
        View z4 = z4(i10);
        if (z4 instanceof j0) {
            ((j0) z4).b();
        }
    }

    public final void d2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.Y3;
            String str = null;
            this.Y3 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z4 = contains;
            int i10 = this.f50037o4;
            this.f50037o4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(this, uri, z4, str2, i10, aVar));
        }
    }

    public final void d3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof v5) {
            v5 v5Var = (v5) y12;
            v5Var.B();
            e1 editText = v5Var.getEditText();
            editText.setSelection(editText.length());
        } else if (y12 instanceof r0) {
            r0 r0Var = (r0) y12;
            r0Var.d.r();
            e1 editText2 = r0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void d4(int i10) {
        a x42 = x4(i10);
        e1 H2 = H2(i10);
        if (w3(x42) && H2 != null) {
            ((TL_iv.pageBlockDetails) x42.f49653b).title = x5.f(H2.getText());
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i11;
        int i12;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f10;
        boolean z4;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f50033m4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                if (R >= 0 && R < arrayList.size()) {
                    aVar4 = (a) arrayList.get(R);
                } else {
                    aVar4 = null;
                }
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.f49660k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f50035n4 == null) {
                    am0 am0Var = new am0(this);
                    this.f50035n4 = am0Var;
                    am0Var.a(null, null, null, this.f50014d3, 1);
                    l8.a(this.f50035n4, this.f50014d3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    float f12 = 0.0f;
                    int i16 = 0;
                    boolean z10 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f13 = 1.0f;
                    while (i16 <= childCount) {
                        if (i16 < childCount) {
                            View childAt = getChildAt(i16);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f49660k;
                                if (i15 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i15);
                                    i10 = childCount;
                                    view = childAt;
                                }
                            }
                            i10 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i10 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z10 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                        } else {
                            int j42 = j4(i15, aVar5, true);
                            l11 = l10;
                            int j43 = j4(i15, aVar6, false);
                            if (f12 - f11 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.y3.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, j42 + f11, B, f12 - j43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f50035n4.b(canvas, rectF, floor, floor, floor, f13);
                                    f10 = f13;
                                    this.f50035n4.e(canvas, rectF, f10);
                                    z10 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f10 = f13;
                            z10 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z10) {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z4 = true;
                                f10 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z4 = z10;
                            }
                            if (aVar != null && aVar == this.P3) {
                                z10 = z4;
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
                                z10 = z4;
                                i16++;
                                aVar6 = aVar;
                                childCount = i10;
                                i15 = i11;
                                i14 = i12;
                                arrayList = arrayList2;
                            }
                        } else {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        }
                        f13 = f10;
                        i16++;
                        aVar6 = aVar;
                        childCount = i10;
                        i15 = i11;
                        i14 = i12;
                        arrayList = arrayList2;
                    }
                    i15++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        r3 r3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        d2 d2Var = this.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        boolean c3 = q4.c(photoEntry);
        if (!photoEntry.isVideo && !c3) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f49657g = S3(photoEntry, str2);
        t3(aVar);
        if (c3) {
            J4(aVar, aVar.f49657g, photoEntry);
            r3Var = this;
        } else {
            r3Var = this;
            r3Var.K4(aVar, aVar.f49657g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        d2 d2Var2 = r3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        r3Var.f50016e3.onContentChanged();
    }

    public final void e3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof v5) {
            v5 v5Var = (v5) y12;
            v5Var.B();
            v5Var.getEditText().setSelection(0);
        } else if (y12 instanceof r0) {
            r0 r0Var = (r0) y12;
            r0Var.d.r();
            r0Var.getEditText().setSelection(0);
        }
    }

    public final void e4(int i10) {
        View z4 = z4(i10);
        if (z4 instanceof v5) {
            ((v5) z4).w();
        }
    }

    public final void f2(i5 i5Var) {
        i5 i5Var2 = this.f50019f4;
        if (i5Var2 != null && i5Var2 != i5Var) {
            LinkedHashSet linkedHashSet = i5Var2.E;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                i5Var2.v.invalidate();
                i5Var2.t();
            }
        }
        this.f50019f4 = i5Var;
        this.f50048z3 = false;
        this.f50025i4 = -1;
        this.f50023h4 = -1;
        i5Var.setCellSelectionListener(this.f50027j4);
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y()) {
            f3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void f4(int i10, int i11) {
        l5 m9;
        View z4 = z4(i10);
        if (z4 instanceof i5) {
            i5 i5Var = (i5) z4;
            if (i11 == 0) {
                i5Var.u();
                return;
            }
            TL_iv.pageTableCell h = i5Var.h(i11);
            if (h != null && (m9 = i5Var.getGrid().m(h)) != null) {
                z5.d(h, m9.f49903a.getText());
            }
        }
    }

    public final i3 g2() {
        int i10;
        int i11;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y() && !F3()) {
            a x42 = x4(f3Var.f23177u0);
            ArrayList arrayList = this.f50024i3;
            int indexOf = arrayList.indexOf(x42);
            int indexOf2 = arrayList.indexOf(x4(f3Var.f23180x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i11 = indexOf;
                    i10 = indexOf2;
                } else {
                    i10 = indexOf;
                    i11 = indexOf2;
                }
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    if (aVar.f49658i || w3(aVar)) {
                        return null;
                    }
                }
                return new i3(this, i10, i11, f3Var.f23179w0, f3Var.f23182z0);
            }
            return null;
        }
        return null;
    }

    public final boolean g3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.g3(android.view.KeyEvent):boolean");
    }

    public e1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof e1) {
            return (e1) findFocus;
        }
        return null;
    }

    public g4 getMapDelegate() {
        return this.f50011a4;
    }

    public View getOverlayView() {
        return this.f50030l3;
    }

    public m9 getTextSelectionHelper() {
        return this.f50028k3;
    }

    public final int h2(int i10) {
        e1 H2 = H2(i10);
        if (H2 != null) {
            return H2.length();
        }
        v5 t22 = t2(i10);
        if (t22 != null) {
            return t22.getEditText().length();
        }
        a x42 = x4(i10);
        if (x42 == null) {
            return 0;
        }
        return v5.z(x42.f49653b).length();
    }

    public final boolean h3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.h3(android.view.MotionEvent):boolean");
    }

    public final int h4(int i10) {
        Layout layout;
        View z4 = z4(i10);
        if (!(z4 instanceof v5) || (layout = ((v5) z4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage i2() {
        if (j3()) {
            ArrayList<TL_iv.PageBlock> Y2 = Y2();
            if (Y2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2();
            richMessage.documents = x2();
            return richMessage;
        }
        return null;
    }

    public final boolean i3(wh.i5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.i3(wh.i5, int, int):boolean");
    }

    public final e1 i4(int i10) {
        View z4 = z4(i10);
        if (z4 instanceof v5) {
            return ((v5) z4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock j2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.j2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean j3() {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.j3():boolean");
    }

    public final boolean k2() {
        e1 editText;
        int length;
        int k10;
        int d;
        e4[] e4VarArr;
        f3 f3Var = this.f50028k3;
        if (f3Var == null || !f3Var.y() || f3Var.f23177u0 != f3Var.f23180x0) {
            return false;
        }
        if (K3()) {
            int i10 = f3Var.f23177u0;
            int i11 = f3Var.f23178v0;
            if (i11 != f3Var.f23181y0) {
                return false;
            }
            editText = M4(i10, i11);
        } else if (x3()) {
            editText = H2(f3Var.f23177u0);
        } else if (v3()) {
            editText = r2(f3Var.f23177u0);
        } else if (F3()) {
            editText = i4(f3Var.f23177u0);
        } else {
            v5 F4 = F4();
            if (F4 == null) {
                return false;
            }
            editText = F4.getEditText();
        }
        if (editText == null || (k10 = w.c.k(f3Var.f23179w0, f3Var.f23182z0, (length = editText.length()), 0)) >= (d = w.c.d(f3Var.f23179w0, f3Var.f23182z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && k10 < d) {
            for (e4 e4Var : (e4[]) text.getSpans(k10, d, e4.class)) {
                if (text.getSpanStart(e4Var) < d && text.getSpanEnd(e4Var) > k10) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean l2() {
        int[] C4 = C4();
        if (C4 == null) {
            return m2(C2());
        }
        for (int i10 = C4[0]; i10 <= C4[1]; i10++) {
            if (m2((a) this.f50024i3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean l3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50024i3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (t tVar : P3((a) arrayList.get(i10))) {
                if (tVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean l4(int i10, int i11, boolean z4) {
        boolean z10;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f50024i3;
            if (i11 < arrayList.size()) {
                d2 d2Var = this.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                if (z4) {
                    z10 = false;
                    while (i11 >= i10) {
                        if (p3(i11, true, true)) {
                            z10 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f49654c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f49654c < aVar.f49654c)) {
                        return false;
                    }
                    z10 = false;
                    while (i10 <= i11) {
                        if (p3(i10, false, true)) {
                            z10 = true;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    r4();
                    if (findFocus() instanceof e1) {
                        W1();
                    } else {
                        this.V2.N(false);
                    }
                    d2 d2Var2 = this.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean m2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f50024i3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f49654c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f49653b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !n2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f49654c < aVar2.f49654c) {
                return false;
            }
            if (o3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                v5Var.f50150f.hideActionMode();
                v5Var.h.hideActionMode();
            } else if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                k5 k5Var = i5Var.v;
                i5Var.f49834r.hideActionMode();
                for (int i11 = 0; i11 < k5Var.getChildCount(); i11++) {
                    View childAt2 = k5Var.getChildAt(i11);
                    if (childAt2 instanceof l5) {
                        ((l5) childAt2).f49903a.hideActionMode();
                    }
                }
            } else if (childAt instanceof j0) {
                ((j0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof r0) {
                ((r0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void m4(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof o4) {
            o4 o4Var = (o4) y12;
            ArrayList arrayList = o4Var.f49951y;
            if (o4Var.f50211a != null) {
                o4Var.n();
                if (o4Var.T >= arrayList.size()) {
                    o4Var.T = Math.max(0, arrayList.size() - 1);
                }
                o4Var.o(false);
                o4Var.requestLayout();
                o4Var.invalidate();
            }
        }
    }

    public final boolean n2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f50024i3;
            if (i10 < arrayList.size() && D3(((a) arrayList.get(i10)).f49653b) && ((a) arrayList.get(i10 - 1)).f49654c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n3(boolean z4) {
        f3 f3Var = this.f50028k3;
        if (f3Var != null) {
            if (z4) {
                f3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(f3Var.f24534r0);
                f3Var.v();
            }
        }
        if (z4) {
            U2();
        } else {
            m3();
        }
    }

    public final void n4() {
        post(new b(this, 3));
    }

    public final boolean o2() {
        int[] C4 = C4();
        if (C4 == null) {
            return p2(C2());
        }
        for (int i10 = C4[0]; i10 <= C4[1]; i10++) {
            if (p2((a) this.f50024i3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean o3(int i10) {
        if (((a) this.f50024i3.get(i10)).f49654c + 1 <= MessagesController.getInstance(this.c3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void o4(int i10) {
        ArrayList arrayList = this.f50024i3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f49654c > 0) {
                View y12 = y1(aVar);
                if (y12 instanceof v5) {
                    ((v5) y12).F();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.J3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.J3);
        this.X2 = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        View F;
        int i14 = i13 - i11;
        int i15 = this.H3;
        if (i15 > 0 && i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        if (z10) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new f2(this, dp, 2));
                }
            }
        }
        this.H3 = i14;
    }

    public final boolean p2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f50024i3).indexOf(aVar)) < 0 || aVar.f49654c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f49654c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean p3(int i10, boolean z4, boolean z10) {
        boolean z11;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f50024i3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z4) {
                    if (aVar2.f49654c > 0) {
                        s2(i10);
                        return true;
                    }
                } else if (aVar2.f49654c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f49653b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if ((z11 || n2(i10)) && o3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z11) {
                            aVar2.f49654c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f49654c = aVar.f49654c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.f49655e = false;
                        aVar2.f49656f = false;
                        return true;
                    }
                } else if ((z10 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f49654c >= aVar2.f49654c)) && o3(i10)) {
                    aVar2.f49654c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void p4(a aVar, t tVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (A3(aVar.f49653b)) {
            ArrayList f32 = f3(aVar.f49653b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (f32 != null && i10 < f32.size()) {
                    f32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                q4(aVar);
                return;
            }
            int size = aVar.h.size();
            w51 w51Var = this.V2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f49653b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) f32.get(0);
                aVar.f49653b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f49657g = (t) aVar.h.get(0);
                aVar.h = null;
                w51Var.N(true);
                m4(aVar);
                return;
            }
            w51Var.N(true);
            m4(aVar);
            return;
        }
        q4(aVar);
    }

    public final boolean q2() {
        d2 d2Var = this.G3;
        if (d2Var != null) {
            if (d2Var.f49734e || !d2Var.f49732b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q3(boolean z4) {
        a aVar;
        int i10;
        int i11;
        int[] C4 = C4();
        if (C4 != null && (i10 = C4[0]) != (i11 = C4[1])) {
            l4(i10, i11, z4);
            return;
        }
        if (C4 == null) {
            aVar = C2();
        } else {
            aVar = (a) this.f50024i3.get(C4[0]);
        }
        if (aVar != null) {
            V3(aVar, z4);
        }
    }

    public final void q4(a aVar) {
        ArrayList arrayList = this.f50024i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.V2.N(true);
        }
    }

    public final e1 r2(int i10) {
        View z4 = z4(i10);
        if (z4 instanceof j0) {
            return ((j0) z4).getCaptionEditText();
        }
        return null;
    }

    public final void r3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f49660k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l10 = (Long) arrayList3.get(i11);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f50026j3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f49669t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f49660k.add((Long) arrayList3.get(i12));
                }
                int i13 = z4.f50258a;
                h51 J = h51.J(z4.class);
                J.G = aVar2;
                J.H = this.f50013c4;
                arrayList2.add(J);
                this.f50033m4.add(aVar2);
            }
        }
    }

    public final void r4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50024i3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f49654c > 0 && aVar.d > 0 && !D3(aVar.f49653b)) {
                    int i11 = aVar.f49654c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f49654c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !D3(aVar2.f49653b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                    aVar.d = i12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void s2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f50024i3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f49654c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f49654c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.f49655e = false;
                aVar2.f49656f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f49654c) > i12) {
                    aVar.f49654c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void s3() {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.s3():void");
    }

    public final void s4(String str) {
        f3 f3Var = this.f50028k3;
        V1(f3Var.f23177u0, f3Var.f23179w0, f3Var.f23180x0, f3Var.f23182z0, str.split("\n", -1));
    }

    public void setAdaptiveLinkDialogs(boolean z4) {
        this.f50020g3 = z4;
    }

    public void setAllowTapAboveContent(boolean z4) {
        this.O3 = z4;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f50018f3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.K3 = new ArrayList();
        ArrayList arrayList = this.f50024i3;
        V2(arrayList, w4.b(charSequence), this.f50026j3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.K3.add((a) arrayList.get(size));
        }
        this.V2.N(false);
    }

    public final v5 t2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m9 = this.U2.m(i10);
        if (!(m9 instanceof v5)) {
            return null;
        }
        return (v5) m9;
    }

    public final void t3(wh.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r3.t3(wh.a):void");
    }

    public final t t4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document R2 = R2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (R2 == null) {
                return null;
            }
            t tVar = new t();
            tVar.f50068c = true;
            tVar.f50066a = 2;
            tVar.h = R2;
            tVar.f50072i = R2;
            return tVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document R22 = R2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (R22 == null) {
                return null;
            }
            t tVar2 = new t();
            tVar2.d = true;
            tVar2.f50066a = 2;
            tVar2.h = R22;
            return tVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document R23 = R2(pageblockvideo.video_id);
                if (R23 == null) {
                    return null;
                }
                t tVar3 = new t();
                tVar3.f50067b = true;
                tVar3.f50066a = 2;
                tVar3.h = R23;
                tVar3.f50077n = pageblockvideo.spoiler;
                while (i10 < R23.attributes.size()) {
                    if (R23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) R23.attributes.get(i10);
                        tVar3.f50073j = tL_documentAttributeVideo.f20852w;
                        tVar3.f50074k = tL_documentAttributeVideo.h;
                        return tVar3;
                    }
                    i10++;
                }
                return tVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 == 0) {
                    photo = null;
                } else {
                    int i12 = 0;
                    loop1: while (true) {
                        if (i12 < this.f50024i3.size()) {
                            for (t tVar4 : P3((a) this.f50024i3.get(i12))) {
                                if (tVar4 != null && (photo = tVar4.f50071g) != null && photo.f20869id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f50022h3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f20869id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = p4.f49963a;
                            synchronized (p4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) p4.f49963a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                t tVar5 = new t();
                tVar5.f50066a = 2;
                tVar5.f50071g = photo;
                tVar5.f50077n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    tVar5.f50073j = closestPhotoSizeWithSize.f20870w;
                    tVar5.f50074k = closestPhotoSizeWithSize.h;
                }
                return tVar5;
            }
        }
    }

    public final void u2() {
        F2();
        this.f50022h3 = null;
        this.Y3 = null;
        this.Z3 = null;
        this.G3 = new d2(this.f50031l4);
        y4();
        this.G3.j();
        p3 p3Var = this.f50016e3;
        if (p3Var != null) {
            p3Var.S();
        }
    }

    public final void u4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f50022h3 != null && aVar != null && (pageBlock = aVar.f49653b) != null) {
            if (A3(pageBlock)) {
                ArrayList f32 = f3(aVar.f49653b);
                aVar.h = new ArrayList();
                if (f32 != null) {
                    for (int i10 = 0; i10 < f32.size(); i10++) {
                        t t42 = t4((TL_iv.PageBlock) f32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (t42 == null) {
                            t42 = new t();
                        }
                        arrayList.add(t42);
                    }
                    return;
                }
                return;
            }
            t t43 = t4(aVar.f49653b);
            if (t43 != null) {
                aVar.f49657g = t43;
            }
        }
    }

    public final boolean v3() {
        int i10;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f23177u0) == f3Var.f23180x0 && i10 >= 0 && i10 < this.f50033m4.size()) {
            return z4(i10) instanceof j0;
        }
        return false;
    }

    public final ArrayList v4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (A3(aVar.f49653b)) {
                ArrayList f32 = f3(aVar.f49653b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (f32 != null) {
                    int size2 = f32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = f32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        t t42 = t4(pageBlock);
                        if (t42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(t42);
                        }
                    }
                    f32.clear();
                    f32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f49653b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    t t43 = t4(pageBlock2);
                    if (t43 != null) {
                        aVar.f49657g = t43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean w2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f50024i3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z4 = aVar.f49658i;
            ArrayList arrayList2 = aVar.f49660k;
            if (!z4) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new Object());
                }
            }
            i10++;
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f49660k;
            if (arrayList3.size() == 1 && (aVar2.f49653b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f49653b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f50026j3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f49653b = pageblockblockquote;
                    arrayList3.clear();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void w4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f4) {
                z zVar = (z) ((f4) childAt);
                zVar.f50212b.a(zVar.f50211a, new sf.h(zVar, 12));
            }
        }
        invalidate();
    }

    public final ArrayList x2() {
        TLRPC.Document document;
        t tVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f50024i3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f49653b instanceof TL_iv.pageBlockDocument) && (tVar = aVar.f49657g) != null && tVar.b() && (document2 = aVar.f49657g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f49653b).document_id = document2.f20851id;
                }
                for (t tVar2 : P3(aVar)) {
                    if (tVar2.b() && (document = tVar2.h) != null) {
                        long j10 = document.f20851id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(tVar2.h);
                        }
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean x3() {
        int i10;
        f3 f3Var = this.f50028k3;
        if (f3Var != null && f3Var.y() && (i10 = f3Var.f23177u0) == f3Var.f23180x0 && w3(x4(i10))) {
            return true;
        }
        return false;
    }

    public final a x4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f50033m4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList y2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f50024i3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : P3((a) arrayList2.get(i10))) {
                if (tVar.b() && (document = tVar.h) != null && hashSet.add(Long.valueOf(document.f20851id))) {
                    arrayList.add(tVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void y4() {
        ArrayList arrayList = this.f50024i3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.V2.N(false);
    }

    @Override
    public final boolean z1() {
        return this.Q3;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f50024i3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : P3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.f50071g) != null && hashSet.add(Long.valueOf(photo.f20869id))) {
                    arrayList.add(tVar.f50071g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View z4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.U2.m(i10);
    }
}
