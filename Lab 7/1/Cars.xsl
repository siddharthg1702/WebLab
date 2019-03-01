<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Cars catalog</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th style="text-align:left">Make</th>
                        <th style="text-align:left">Model</th>
                        <th style="text-align:left">Year</th>
                        <th style="text-align:left">Color</th>
                        <th style="text-align:left">Engine</th>
                        <th style="text-align:left">Doors</th>
                        <th style="text-align:left">Transmission Types</th>
                        <th style="text-align:left">Accessories</th>
                        <!-- <th style="text-align:left"></th> -->

                    </tr>
                    <xsl:for-each select="catalog/car">
                        <tr>
                            <td>
                                <xsl:value-of select="make"/>
                            </td>
                            <td>
                                <xsl:value-of select="model"/>
                            </td>
                            <td>
                                <xsl:value-of select="year"/>
                            </td>
                            <td>
                                <xsl:value-of select="color"/>
                            </td>
                            <td>
                                <xsl:value-of select="engine"/>
                            </td>
                            <td>
                                <xsl:value-of select="number_of_doors"/>
                            </td>
                            <td>
                                <xsl:value-of select="transmission_type"/>
                            </td>
                            <td>
                                <xsl:value-of select="accessories"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>