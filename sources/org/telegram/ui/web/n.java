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
import org.telegram.ui.ActionBar.p2;
public final class n extends org.telegram.ui.ActionBar.j {
    public final p f42645a;

    public n(p pVar) {
        this.f42645a = pVar;
    }

    @Override
    public final void b(int i10) {
        String str;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        p pVar = this.f42645a;
        HashSet hashSet = pVar.f42663w;
        if (i10 == -1) {
            kVar = ((p2) pVar).actionBar;
            if (kVar.s()) {
                kVar2 = ((p2) pVar).actionBar;
                kVar2.r();
                hashSet.clear();
                AndroidUtilities.forEachViews((RecyclerView) pVar.f25815a, (h5.d) new ag.d(16));
                return;
            }
            pVar.finishFragment();
        } else if (i10 == R.id.menu_delete) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet3 = new HashSet();
            Iterator it = hashSet.iterator();
            while (true) {
                MessageObject messageObject = null;
                int i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                ArrayList arrayList2 = pVar.d.f42581a;
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i12);
                    i12++;
                    MessageObject messageObject2 = (MessageObject) obj;
                    if (messageObject2 != null && messageObject2.getId() == intValue) {
                        messageObject = messageObject2;
                        break;
                    }
                }
                i iVar = pVar.f42658e;
                if (iVar != null && messageObject == null) {
                    ArrayList arrayList3 = iVar.f42581a;
                    int size2 = arrayList3.size();
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList3.get(i11);
                        i11++;
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pVar.getParentActivity(), 0, pVar.getResourceProvider());
            alertDialog$Builder.f21166a.O = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
            if (hashSet3.size() == 1) {
                str = "AreYouSureUnsaveSingleMessage";
            } else {
                str = "AreYouSureUnsaveFewMessages";
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(str);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m(0, pVar, hashSet3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (i10 == R.id.menu_link) {
            pVar.d0();
        }
    }
}
