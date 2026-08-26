package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

public final class WebMetadataCache$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final WebMetadataCache f$0;

    public WebMetadataCache$$ExternalSyntheticLambda0(WebMetadataCache webMetadataCache, int i) {
        this.$r8$classId = i;
        this.f$0 = webMetadataCache;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                final WebMetadataCache webMetadataCache = this.f$0;
                if (!webMetadataCache.saving) {
                    webMetadataCache.saving = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (WebMetadataCache.WebMetadata webMetadata : webMetadataCache.cache.values()) {
                        if (!TextUtils.isEmpty(webMetadata.domain) && jCurrentTimeMillis - webMetadata.time <= 604800000) {
                            arrayList.add(0, webMetadata);
                            if (arrayList.size() >= 100) {
                                final int i = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i) {
                                            case 0:
                                                WebMetadataCache webMetadataCache2 = webMetadataCache;
                                                webMetadataCache2.getClass();
                                                int i2 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i2 >= arrayList2.size()) {
                                                        webMetadataCache2.loaded = true;
                                                        webMetadataCache2.loading = false;
                                                    } else {
                                                        WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) arrayList2.get(i2);
                                                        webMetadataCache2.cache.put(webMetadata2.domain, webMetadata2);
                                                        i2++;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                WebMetadataCache webMetadataCache3 = webMetadataCache;
                                                webMetadataCache3.getClass();
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                if (!file.exists()) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        webMetadataCache3.saving = false;
                                                        return;
                                                    }
                                                }
                                                WebMetadataCache.MetadataFile metadataFile = new WebMetadataCache.MetadataFile();
                                                metadataFile.array.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(metadataFile.getObjectSize());
                                                metadataFile.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e2) {
                                                    FileLog.e(e2);
                                                }
                                                AndroidUtilities.runOnUIThread(new WebMetadataCache$$ExternalSyntheticLambda0(webMetadataCache3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i2 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    WebMetadataCache webMetadataCache2 = webMetadataCache;
                                    webMetadataCache2.getClass();
                                    int i3 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i3 >= arrayList2.size()) {
                                            webMetadataCache2.loaded = true;
                                            webMetadataCache2.loading = false;
                                        } else {
                                            WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) arrayList2.get(i3);
                                            webMetadataCache2.cache.put(webMetadata2.domain, webMetadata2);
                                            i3++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    WebMetadataCache webMetadataCache3 = webMetadataCache;
                                    webMetadataCache3.getClass();
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    if (!file.exists()) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            webMetadataCache3.saving = false;
                                            return;
                                        }
                                    }
                                    WebMetadataCache.MetadataFile metadataFile = new WebMetadataCache.MetadataFile();
                                    metadataFile.array.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(metadataFile.getObjectSize());
                                    metadataFile.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                    AndroidUtilities.runOnUIThread(new WebMetadataCache$$ExternalSyntheticLambda0(webMetadataCache3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                final WebMetadataCache webMetadataCache2 = this.f$0;
                webMetadataCache2.getClass();
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        WebMetadataCache.MetadataFile metadataFile = new WebMetadataCache.MetadataFile();
                        metadataFile.readParams(serializedData, true);
                        arrayList2.addAll(metadataFile.array);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    final int i3 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    WebMetadataCache webMetadataCache3 = webMetadataCache2;
                                    webMetadataCache3.getClass();
                                    int i4 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i4 >= arrayList3.size()) {
                                            webMetadataCache3.loaded = true;
                                            webMetadataCache3.loading = false;
                                        } else {
                                            WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) arrayList3.get(i4);
                                            webMetadataCache3.cache.put(webMetadata2.domain, webMetadata2);
                                            i4++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    WebMetadataCache webMetadataCache4 = webMetadataCache2;
                                    webMetadataCache4.getClass();
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    if (!file2.exists()) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e2) {
                                            FileLog.e(e2);
                                            webMetadataCache4.saving = false;
                                            return;
                                        }
                                    }
                                    WebMetadataCache.MetadataFile metadataFile2 = new WebMetadataCache.MetadataFile();
                                    metadataFile2.array.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(metadataFile2.getObjectSize());
                                    metadataFile2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                    }
                                    AndroidUtilities.runOnUIThread(new WebMetadataCache$$ExternalSyntheticLambda0(webMetadataCache4, 2));
                                    break;
                            }
                        }
                    });
                } else {
                    webMetadataCache2.loaded = true;
                }
                break;
            default:
                this.f$0.saving = false;
                break;
        }
    }
}
