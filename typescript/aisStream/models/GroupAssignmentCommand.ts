/**
 * Ais-Stream WebsocketObjects
 * A sample API to illustrate OpenAPI concepts
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class GroupAssignmentCommand {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'spare1': number;
    'longitude1': number;
    'latitude1': number;
    'longitude2': number;
    'latitude2': number;
    'stationType': number;
    'shipType': number;
    'spare2': number;
    'txRxMode': number;
    'reportingInterval': number;
    'quietTime': number;
    'spare3': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "messageID",
            "baseName": "MessageID",
            "type": "number",
            "format": ""
        },
        {
            "name": "repeatIndicator",
            "baseName": "RepeatIndicator",
            "type": "number",
            "format": ""
        },
        {
            "name": "userID",
            "baseName": "UserID",
            "type": "number",
            "format": ""
        },
        {
            "name": "valid",
            "baseName": "Valid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "spare1",
            "baseName": "Spare1",
            "type": "number",
            "format": ""
        },
        {
            "name": "longitude1",
            "baseName": "Longitude1",
            "type": "number",
            "format": "double"
        },
        {
            "name": "latitude1",
            "baseName": "Latitude1",
            "type": "number",
            "format": "double"
        },
        {
            "name": "longitude2",
            "baseName": "Longitude2",
            "type": "number",
            "format": "double"
        },
        {
            "name": "latitude2",
            "baseName": "Latitude2",
            "type": "number",
            "format": "double"
        },
        {
            "name": "stationType",
            "baseName": "StationType",
            "type": "number",
            "format": ""
        },
        {
            "name": "shipType",
            "baseName": "ShipType",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare2",
            "baseName": "Spare2",
            "type": "number",
            "format": ""
        },
        {
            "name": "txRxMode",
            "baseName": "TxRxMode",
            "type": "number",
            "format": ""
        },
        {
            "name": "reportingInterval",
            "baseName": "ReportingInterval",
            "type": "number",
            "format": ""
        },
        {
            "name": "quietTime",
            "baseName": "QuietTime",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare3",
            "baseName": "Spare3",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GroupAssignmentCommand.attributeTypeMap;
    }

    public constructor() {
    }
}
