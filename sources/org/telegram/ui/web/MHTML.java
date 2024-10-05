package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MHTML {
    public final String boundary;
    public final ArrayList entries;
    public final HashMap entriesByLocation;
    public final File file;
    private final long[] filePos;
    public final HashMap headers;

    public static class BoundedInputStream extends FileInputStream {
        private long bytesRead;
        private final long endOffset;

        public BoundedInputStream(File file, long j, long j2) {
            super(file);
            this.bytesRead = 0L;
            this.endOffset = j2;
            if (j > 0 && skip(j) != j) {
                throw new RuntimeException("BoundedInputStream failed to skip");
            }
        }

        @Override
        public int read() {
            if (getChannel().position() >= this.endOffset) {
                return -1;
            }
            return super.read();
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            long position = getChannel().position();
            long j = this.endOffset;
            if (position >= j) {
                return -1;
            }
            long position2 = j - getChannel().position();
            if (i2 > position2) {
                i2 = (int) position2;
            }
            return super.read(bArr, i, i2);
        }
    }

    public static class Entry {
        public long end;
        public File file;
        public final HashMap headers;
        public long start;

        private Entry() {
            this.headers = new HashMap();
        }

        public InputStream getInputStream() {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getRawInputStream());
            return "base64".equals(getTransferEncoding()) ? new Base64InputStream(bufferedInputStream, 0) : "quoted-printable".equalsIgnoreCase(getTransferEncoding()) ? new QuotedPrintableInputStream(bufferedInputStream) : bufferedInputStream;
        }

        public String getLocation() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-location"));
        }

        public InputStream getRawInputStream() {
            return new BoundedInputStream(this.file, this.start, this.end);
        }

        public String getTransferEncoding() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-transfer-encoding"));
        }

        public String getType() {
            return HeaderValue.getValue((HeaderValue) this.headers.get("content-type"));
        }
    }

    public static class HeaderValue {
        public final HashMap props;
        public String value;

        private HeaderValue() {
            this.props = new HashMap();
        }

        public static String getProp(HeaderValue headerValue, String str) {
            if (headerValue == null) {
                return null;
            }
            return (String) headerValue.props.get(str);
        }

        public static String getValue(HeaderValue headerValue) {
            if (headerValue == null) {
                return null;
            }
            return headerValue.value;
        }
    }

    public static class QuotedPrintableInputStream extends FilterInputStream {
        public QuotedPrintableInputStream(InputStream inputStream) {
            super(inputStream);
        }

        private int hexDigitToInt(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                throw new IllegalArgumentException("Invalid hexadecimal digit");
            }
            return i - 87;
        }

        private int hexToByte(int i, int i2) {
            return (hexDigitToInt(i) << 4) | hexDigitToInt(i2);
        }

        @Override
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != 61) {
                return read;
            }
            int read2 = ((FilterInputStream) this).in.read();
            int read3 = ((FilterInputStream) this).in.read();
            if (read2 == -1 || read3 == -1) {
                throw new IOException("Invalid quoted-printable encoding");
            }
            return (read2 == 13 && read3 == 10) ? read() : (read2 == 10 || read3 == 10) ? read3 : hexToByte(read2, read3);
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read != -1) {
                    bArr[i + i3] = (byte) read;
                    i4++;
                    i3++;
                } else if (i4 == 0) {
                    return -1;
                }
            }
            return i4;
        }
    }

    public MHTML(File file) {
        HashMap hashMap = new HashMap();
        this.headers = hashMap;
        this.entries = new ArrayList();
        this.entriesByLocation = new HashMap();
        this.filePos = new long[1];
        this.file = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        hashMap.putAll(parseHeaders(bufferedReader));
        String prop = HeaderValue.getProp((HeaderValue) hashMap.get("content-type"), "boundary");
        this.boundary = prop;
        if (prop != null) {
            parseEntries(bufferedReader, fileInputStream);
        }
        bufferedReader.close();
    }

    private static void appendHeader(String str, String str2, HashMap hashMap) {
        HeaderValue headerValue = new HeaderValue();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i == 0 || indexOf < 0) {
                    headerValue.value = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = trim3.substring(1, trim3.length() - 1);
                    }
                    headerValue.props.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), headerValue);
    }

    private void parseEntries(BufferedReader bufferedReader, FileInputStream fileInputStream) {
        int length = this.boundary.length() + 2;
        Entry entry = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            long[] jArr = this.filePos;
            jArr[0] = jArr[0] + readLine.getBytes().length + 2;
            if (readLine.length() == length && readLine.substring(2).equals(this.boundary)) {
                if (entry != null) {
                    entry.end = (this.filePos[0] - length) - 2;
                    this.entries.add(entry);
                    this.entriesByLocation.put(entry.getLocation(), entry);
                }
                entry = new Entry();
                entry.file = this.file;
                entry.headers.putAll(parseHeaders(bufferedReader));
                entry.start = this.filePos[0];
            }
        }
        if (entry == null || entry.start == 0 || entry.end == 0) {
            return;
        }
        this.entries.add(entry);
        this.entriesByLocation.put(entry.getLocation(), entry);
    }

    private HashMap parseHeaders(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = this.filePos;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                }
                if (str == null || sb == null) {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb = new StringBuilder();
                            sb.append(trim3);
                            str = trim2;
                        } else {
                            appendHeader(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            appendHeader(str, sb.toString(), hashMap);
        }
        if (str != null && sb != null) {
            appendHeader(str, sb.toString(), hashMap);
        }
        return hashMap;
    }
}
