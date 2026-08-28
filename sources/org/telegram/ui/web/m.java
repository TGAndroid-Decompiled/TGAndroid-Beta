package org.telegram.ui.web;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ei1;
public final class m extends org.telegram.ui.ActionBar.j {
    public final o f43930a;

    public m(o oVar) {
        this.f43930a = oVar;
    }

    @Override
    public final void b(int i9) {
        String str;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        o oVar = this.f43930a;
        HashSet hashSet = oVar.f43947w;
        if (i9 == -1) {
            kVar = ((o2) oVar).actionBar;
            if (kVar.s()) {
                kVar2 = ((o2) oVar).actionBar;
                kVar2.r();
                hashSet.clear();
                AndroidUtilities.forEachViews((RecyclerView) oVar.f27658a, (d5.d) new ih.e(14));
                return;
            }
            oVar.finishFragment();
        } else if (i9 == R.id.menu_delete) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet3 = new HashSet();
            Iterator it = hashSet.iterator();
            while (true) {
                MessageObject messageObject = null;
                int i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                ArrayList arrayList2 = oVar.d.f43886a;
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i11);
                    i11++;
                    MessageObject messageObject2 = (MessageObject) obj;
                    if (messageObject2 != null && messageObject2.getId() == intValue) {
                        messageObject = messageObject2;
                        break;
                    }
                }
                i iVar = oVar.f43942e;
                if (iVar != null && messageObject == null) {
                    ArrayList arrayList3 = iVar.f43886a;
                    int size2 = arrayList3.size();
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        MessageObject messageObject3 = (MessageObject) obj2;
                        if (messageObject3 != null && messageObject3.getId() == intValue) {
                            messageObject = messageObject3;
                            break;
                        }
                    }
                }
                if (messageObject != null) {
                    arrayList.add(messageObject);
                    hashSet3.add(Integer.valueOf(messageObject.getId()));
                    hashSet2.add(k.a(messageObject));
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oVar.getParentActivity(), 0, oVar.getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
            if (hashSet3.size() == 1) {
                str = "AreYouSureUnsaveSingleMessage";
            } else {
                str = "AreYouSureUnsaveFewMessages";
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ei1(1, oVar, hashSet3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (i9 == R.id.menu_link) {
            oVar.c0();
        }
    }
}
